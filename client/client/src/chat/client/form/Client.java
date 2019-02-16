package chat.client.form;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client {

    //Form
    //------------------------------------------------------------------------------------------------------------------
    private JFrame clientWindow;
    //------------------------------------------------------------------------------------------------------------------

    //Parameters
    //------------------------------------------------------------------------------------------------------------------
    private int WIDTH;
    private int HEIGHT;

    private int WIDTH_TOP_PANEL, HEIGHT_TOP_PANEL;
    private int WIDTH_CENTER_PANEL, HEIGHT_CENTER_PANEL;

    private int WIDTH_NAME_LABEL, HEIGHT_NAME_LABEL;
    private int WIDTH_SURNAME_LABEL, HEIGHT_SURNAME_LABEL;
    private int WIDTH_PATR_LABEL, HEIGHT_PATR_LABEL;

    private int WIDTH_NAME, HEIGHT_NAME;
    private int WIDTH_SURNAME, HEIGHT_SURNAME;
    private int WIDTH_PATR, HEIGHT_PATR;

    private int WIDTH_PHOTO, HEIGHT_PHOTO;
    private int WIDTH_BUI, HEIGHT_BUI;
    //------------------------------------------------------------------------------------------------------------------

    //Buttons
    //------------------------------------------------------------------------------------------------------------------
    private JButton sendMessage;
    private JButton settings;
    private JButton settingOfConf;
    //------------------------------------------------------------------------------------------------------------------

    //Text area
    //------------------------------------------------------------------------------------------------------------------
    private JTextField name;
    private JTextField surname;
    private JTextField patr;
    private JTextField messageArea;
    //------------------------------------------------------------------------------------------------------------------

    //Labels
    //------------------------------------------------------------------------------------------------------------------
    private JLabel labelOfName;
    private JLabel labelOfSurname;
    private JLabel labelOfPatr;
    //------------------------------------------------------------------------------------------------------------------

    //Panels
    //------------------------------------------------------------------------------------------------------------------
    private JPanel panelTop;
    private JPanel panelCenter;

    private JPanel ptUsersPhoto;
    private JPanel ptUsersBaseInformation;
    private JPanel ptUsersName;
    private JPanel ptUsersSurname;
    private JPanel ptUsersPatr;
    //------------------------------------------------------------------------------------------------------------------

    public Client(){
        draw();
    }

    public int getWIDTH(){ return this.WIDTH; }

    public int getHEIGHT(){
        return this.HEIGHT;
    }

    public void setWIDTH(int value){
        this.WIDTH = value;
    }

    public void setHEIGHT(int value) {
        this.HEIGHT = value;
    }

    private void draw(){
        clientWindow = new JFrame("Client");
        WIDTH= 500;
        HEIGHT = 800;
        clientWindow.setBounds(500,200,WIDTH,HEIGHT);
        clientWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clientWindow.setResizable(false);

        WIDTH_TOP_PANEL = WIDTH;
        HEIGHT_TOP_PANEL = 200;

        WIDTH_CENTER_PANEL = WIDTH;
        HEIGHT_CENTER_PANEL = HEIGHT - HEIGHT_TOP_PANEL;

        createTopPanel(WIDTH_TOP_PANEL,HEIGHT_TOP_PANEL,0,0);
        createCenterPanel(WIDTH_CENTER_PANEL,HEIGHT_CENTER_PANEL,0,200);

        clientWindow.add(panelTop, BorderLayout.CENTER);
        clientWindow.add(panelCenter, BorderLayout.CENTER);
        clientWindow.setVisible(true);
    }

    private void createTopPanel(int width, int height, int  x, int y){
        this.panelTop = new JPanel();
        this.panelTop.setSize(width,height);
        this.panelTop.setBackground(Color.CYAN);
        this.panelTop.setLocation(x,y);
        createSpaceTopPanel();
        this.panelTop.setLayout(new GridLayout(1,2));
        this.panelTop.add(this.ptUsersPhoto);
        this.panelTop.add(this.ptUsersBaseInformation);
        this.panelTop.setVisible(true);
    }

    private void createCenterPanel(int width, int height, int x, int y){
        this.panelCenter = new JPanel();
        this.panelCenter.setSize(width,height);
        this.panelCenter.setBackground(new Color(97,180,207));
        this.panelCenter.setLocation(x,y);
        this.panelCenter.setLayout(new BorderLayout());
        cretaeSpaceCenterPanel();
        this.panelCenter.add(this.messageArea, BorderLayout.SOUTH);
        this.panelCenter.setVisible(true);
    }

    private void createSpaceTopPanel(){
        //PHOTO
        this.ptUsersPhoto = new JPanel();
        WIDTH_PHOTO = HEIGHT_TOP_PANEL;
        HEIGHT_PHOTO = HEIGHT_TOP_PANEL;
        this.ptUsersPhoto.setBounds(0,0,WIDTH_PHOTO,HEIGHT_PHOTO);
        this.ptUsersPhoto.setBackground(new Color(58,170,207));

        //BASE USERS INFORMATION
        this.ptUsersBaseInformation = new JPanel();
        WIDTH_BUI = WIDTH_TOP_PANEL - HEIGHT_TOP_PANEL;
        HEIGHT_BUI = HEIGHT_TOP_PANEL;
        this.ptUsersBaseInformation.setBounds(HEIGHT_TOP_PANEL,0,WIDTH_BUI,HEIGHT_BUI);
        this.ptUsersBaseInformation.setBackground(Color.ORANGE);
        this.ptUsersBaseInformation.setLayout(new GridLayout(3,1));

        //NAME
        this.ptUsersName = new JPanel();
        this.ptUsersName.setBackground(Color.CYAN);

        this.labelOfName = new JLabel("Name:");
        this.labelOfName.setBounds(0,0,100,60);
        this.name = new JTextField();
        this.name.setBounds(100,0,200,60);
        this.name.setColumns(10);

        this.ptUsersName.add(this.labelOfName);
        this.ptUsersName.add(this.name);
        this.ptUsersBaseInformation.add(this.ptUsersName);

        //SURNAME
        this.ptUsersSurname = new JPanel();
        this.ptUsersSurname.setLayout(new FlowLayout());
        this.ptUsersSurname.setBackground(Color.GRAY);

        this.labelOfSurname = new JLabel("Surname:");
        this.labelOfSurname.setBounds(0,0,60,60);
        this.surname = new JTextField();
        this.surname.setBounds(100,0,200,60);
        this.surname.setColumns(10);

        this.ptUsersSurname.add(this.labelOfSurname);
        this.ptUsersSurname.add(this.surname);
        this.ptUsersBaseInformation.add(this.ptUsersSurname);

        //PATR
        this.ptUsersPatr = new JPanel();
        this.ptUsersPatr.setBackground(Color.ORANGE);
        this.ptUsersPatr.setLayout(new FlowLayout());
        this.ptUsersBaseInformation.add(this.ptUsersPatr);

        this.labelOfPatr = new JLabel("Patronymic");
        this.labelOfPatr.setBounds(0,0,100,60);
        this.patr = new JTextField();
        this.patr.setBounds(100,0,200,60);
        this.patr.setColumns(10);

        this.ptUsersPatr.add(this.labelOfPatr);
        this.ptUsersPatr.add(this.patr);
        this.ptUsersPhoto.setVisible(true);
        this.ptUsersBaseInformation.setVisible(true);
    }

    private void cretaeSpaceCenterPanel(){

        this.messageArea = new JTextField();
        this.messageArea.setColumns(10);
        this.messageArea.setBounds(10,10,200,50);
        this.messageArea.setVisible(true);

    }
}
