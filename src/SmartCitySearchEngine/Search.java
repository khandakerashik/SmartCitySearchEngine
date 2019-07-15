package SmartCitySearchEngine;


import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashik
 */
public class Search extends javax.swing.JFrame {
    Statement st;
    ResultSet rs;
    Connection con = SQLiteJDBCDriverConnection.ConnectDB();   
    /**
     * Creates new form table
     */
    public Search() {
        super("Search");
        initComponents();
        //findEntity();
        //findEntityATM();
    }
    
    public ArrayList<Entity>ListEntity(String ValToSearch)
    {
        ArrayList<Entity> entityList = new ArrayList<Entity>();
        try{
            st = con.createStatement();
            String searchQuery = "SELECT * FROM `Entity` WHERE Name Like'%"+ValToSearch+"%'or Type Like'%"+ValToSearch+"%'or Phone Like'%"+ValToSearch+"%'or Location Like'%"+ValToSearch+"%'or Website Like'%"+ValToSearch+"%'";
            rs = st.executeQuery(searchQuery);
            Entity entity;
            while(rs.next())
            {
                entity = new Entity(
                    rs.getString("Id"),
                    rs.getString("Name"),
                    rs.getString("Type"),
                    rs.getString("Location"),
                    rs.getString("Phone"),
                    rs.getString("Email"),
                    rs.getString("Website")
                        );
                entityList.add(entity);
            }
            //else
           // {
          //     JOptionPane.showMessageDialog(null, "SORRY! Theres no such data in our database.");            
           //}
            
           
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return entityList;
    }
    
    // function to display data in jtable
    public void findEntity()
    {
        ArrayList<Entity> entity = ListEntity(searchField.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Id","Name","Type","Location","Phone","Email","Website"});
        Object[] row = new Object[7];
        
        for(int i = 0; i < entity.size(); i++)
        {
            row[0] = entity.get(i).getId();
            row[1] = entity.get(i).getName();
            row[2] = entity.get(i).getType();
            row[3] = entity.get(i).getLocation();
            row[4] = entity.get(i).getPhone();
            row[5] = entity.get(i).getEmail();
            row[6] = entity.get(i).getWebsite();
            model.addRow(row);
        }
       jTable1.setModel(model);
    }
    public ArrayList<Entity>ListEntityATM(String ValToSearch)
    {
        ArrayList<Entity> entityList = new ArrayList<Entity>();
        try{
            st = con.createStatement();
            String searchQuery = "SELECT * FROM `Entity` WHERE Type Like'%atm%'";
            rs = st.executeQuery(searchQuery);
            Entity entity;
            while(rs.next())
            {
                    entity = new Entity(
                    rs.getString("Id"),
                    rs.getString("Name"),
                    rs.getString("Type"),
                    rs.getString("Location"),
                    rs.getString("Phone"),
                    rs.getString("Email"),
                    rs.getString("Website")
                        );
                entityList.add(entity);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return entityList;
    }
       
    // function to display ATM's in jtable
    public void findEntityATM()
    {
        String atm="atm";
        ArrayList<Entity> entity = ListEntityATM(atm);
        DefaultTableModel modelATM = new DefaultTableModel();
        modelATM.setColumnIdentifiers(new Object[]{"Id","Name","Type","Location","Phone","Email","Website"});
        Object[] row = new Object[7];
        
        for(int i = 0; i < entity.size(); i++)
        {
            row[0] = entity.get(i).getId();
            row[1] = entity.get(i).getName();
            row[2] = entity.get(i).getType();
            row[3] = entity.get(i).getLocation();
            row[4] = entity.get(i).getPhone();
            row[5] = entity.get(i).getEmail();
            row[6] = entity.get(i).getWebsite();
            modelATM.addRow(row);
        }
       jTable1.setModel(modelATM);
    }
public ArrayList<Entity>ListEntityHospitals(String ValToSearch)
    {
        ArrayList<Entity> entityList = new ArrayList<Entity>();
        try{
            st = con.createStatement();
            String searchQuery = "SELECT * FROM `Entity` WHERE Type Like'%hospital%'";
            rs = st.executeQuery(searchQuery);
            Entity entity;
            while(rs.next())
            {
                    entity = new Entity(
                    rs.getString("Id"),
                    rs.getString("Name"),
                    rs.getString("Type"),
                    rs.getString("Location"),
                    rs.getString("Phone"),
                    rs.getString("Email"),
                    rs.getString("Website")
                        );
                entityList.add(entity);
            }
            //else
            //{
             //   JOptionPane.showMessageDialog(null, "SORRY! Theres no such data in our database.");
            //}
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return entityList;
    }

    // function to display Hospitals in jtable
    public void findEntityHospitals()
    {
        String hospital="hospital";
        ArrayList<Entity> entity = ListEntityHospitals(hospital);
        DefaultTableModel modelHospital = new DefaultTableModel();
        modelHospital.setColumnIdentifiers(new Object[]{"Id","Name","Type","Location","Phone","Email","Website"});
        Object[] row = new Object[7];
        
        for(int i = 0; i < entity.size(); i++)
        {
            row[0] = entity.get(i).getId();
            row[1] = entity.get(i).getName();
            row[2] = entity.get(i).getType();
            row[3] = entity.get(i).getLocation();
            row[4] = entity.get(i).getPhone();
            row[5] = entity.get(i).getEmail();
            row[6] = entity.get(i).getWebsite();
            modelHospital.addRow(row);
        }
       jTable1.setModel(modelHospital);
    }
    public ArrayList<Entity>ListEntityBanks(String ValToSearch)
    {
        ArrayList<Entity> entityList = new ArrayList<Entity>();
        try{
            st = con.createStatement();
            String searchQuery = "SELECT * FROM `Entity` WHERE Type Like'%bank%'";
            rs = st.executeQuery(searchQuery);
            Entity entity;
            while(rs.next())
            {
                    entity = new Entity(
                        rs.getString("Id"),
                        rs.getString("Name"),
                        rs.getString("Type"),
                        rs.getString("Location"),
                        rs.getString("Phone"),
                        rs.getString("Email"),
                        rs.getString("Website")
                        );
                entityList.add(entity);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return entityList;
    }
    // function to display Banks in jtable    
     public void findEntityBanks()
    {
        String bank="bank";
        ArrayList<Entity> entity = ListEntityBanks(bank);
        DefaultTableModel modelBank = new DefaultTableModel();
        modelBank.setColumnIdentifiers(new Object[]{"Id","Name","Type","Location","Phone","Email","Website"});
        Object[] row = new Object[7];
        
        for(int i = 0; i < entity.size(); i++)
        {
            row[0] = entity.get(i).getId();
            row[1] = entity.get(i).getName();
            row[2] = entity.get(i).getType();
            row[3] = entity.get(i).getLocation();
            row[4] = entity.get(i).getPhone();
            row[5] = entity.get(i).getEmail();
            row[6] = entity.get(i).getWebsite();
            modelBank.addRow(row);
        }
       jTable1.setModel(modelBank);
    }
     public ArrayList<Entity>ListEntitySchools(String ValToSearch)
    {
        ArrayList<Entity> entityList = new ArrayList<Entity>();
        try{
            st = con.createStatement();
            String searchQuery = "SELECT * FROM `Entity` WHERE Type Like'%school%'";
            rs = st.executeQuery(searchQuery);
            Entity entity;
            while(rs.next())
            {
                    entity = new Entity(
                        rs.getString("Id"),
                        rs.getString("Name"),
                        rs.getString("Type"),
                        rs.getString("Location"),
                        rs.getString("Phone"),
                        rs.getString("Email"),
                        rs.getString("Website")
                        );
                entityList.add(entity);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return entityList;
    }
     // function to display Schools in jtable    
     public void findEntitySchools()
    {
        String school="school";
        ArrayList<Entity> entity = ListEntitySchools(school);
        DefaultTableModel modelSchools = new DefaultTableModel();
        modelSchools.setColumnIdentifiers(new Object[]{"Id","Name","Type","Location","Phone","Email","Website"});
        Object[] row = new Object[7];
        
        for(int i = 0; i < entity.size(); i++)
        {
            row[0] = entity.get(i).getId();
            row[1] = entity.get(i).getName();
            row[2] = entity.get(i).getType();
            row[3] = entity.get(i).getLocation();
            row[4] = entity.get(i).getPhone();
            row[5] = entity.get(i).getEmail();
            row[6] = entity.get(i).getWebsite();
            modelSchools.addRow(row);
        }
       jTable1.setModel(modelSchools);
    }
     public ArrayList<Entity>ListEntityColleges(String ValToSearch)
    {
        ArrayList<Entity> entityList = new ArrayList<Entity>();
        try{
            st = con.createStatement();
            String searchQuery = "SELECT * FROM `Entity` WHERE Type Like'%college%'";
            rs = st.executeQuery(searchQuery);
            Entity entity;
            while(rs.next())
            {
                    entity = new Entity(
                        rs.getString("Id"),
                        rs.getString("Name"),
                        rs.getString("Type"),
                        rs.getString("Location"),
                        rs.getString("Phone"),
                        rs.getString("Email"),
                        rs.getString("Website")
                        );
                entityList.add(entity);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return entityList;
    }
     // function to display Colleges in jtable    
     public void findEntityColleges()
    {
        String college="college";
        ArrayList<Entity> entity = ListEntityColleges(college);
        DefaultTableModel modelColleges = new DefaultTableModel();
        modelColleges.setColumnIdentifiers(new Object[]{"Id","Name","Type","Location","Phone","Email","Website"});
        Object[] row = new Object[7];
        
        for(int i = 0; i < entity.size(); i++)
        {
            row[0] = entity.get(i).getId();
            row[1] = entity.get(i).getName();
            row[2] = entity.get(i).getType();
            row[3] = entity.get(i).getLocation();
            row[4] = entity.get(i).getPhone();
            row[5] = entity.get(i).getEmail();
            row[6] = entity.get(i).getWebsite();
            modelColleges.addRow(row);
        }
       jTable1.setModel(modelColleges);
    }
     public ArrayList<Entity>ListEntityUniversities(String ValToSearch)
    {
        ArrayList<Entity> entityList = new ArrayList<Entity>();
        try{
            st = con.createStatement();
            String searchQuery = "SELECT * FROM `Entity` WHERE Type Like'%university%'";
            rs = st.executeQuery(searchQuery);
            Entity entity;
            while(rs.next())
            {
                    entity = new Entity(
                        rs.getString("Id"),
                        rs.getString("Name"),
                        rs.getString("Type"),
                        rs.getString("Location"),
                        rs.getString("Phone"),
                        rs.getString("Email"),
                        rs.getString("Website")
                        );
                entityList.add(entity);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return entityList;
    }
     // function to display Universities in jtable    
     public void findEntityUniversities()
    {
        String university="university";
        ArrayList<Entity> entity = ListEntityUniversities(university);
        DefaultTableModel modelUniversities = new DefaultTableModel();
        modelUniversities.setColumnIdentifiers(new Object[]{"Id","Name","Type","Location","Phone","Email","Website"});
        Object[] row = new Object[7];
        
        for(int i = 0; i < entity.size(); i++)
        {
            row[0] = entity.get(i).getId();
            row[1] = entity.get(i).getName();
            row[2] = entity.get(i).getType();
            row[3] = entity.get(i).getLocation();
            row[4] = entity.get(i).getPhone();
            row[5] = entity.get(i).getEmail();
            row[6] = entity.get(i).getWebsite();
            modelUniversities.addRow(row);
        }
       jTable1.setModel(modelUniversities);
    }
      public ArrayList<Entity>ListEntityRestaurants(String ValToSearch)
    {
        ArrayList<Entity> entityList = new ArrayList<Entity>();
        try{
            st = con.createStatement();
            String searchQuery = "SELECT * FROM `Entity` WHERE Type Like'%restaurant%'";
            rs = st.executeQuery(searchQuery);
            Entity entity;
            while(rs.next())
            {
                    entity = new Entity(
                        rs.getString("Id"),
                        rs.getString("Name"),
                        rs.getString("Type"),
                        rs.getString("Location"),
                        rs.getString("Phone"),
                        rs.getString("Email"),
                        rs.getString("Website")
                        );
                entityList.add(entity);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return entityList;
    }
     // function to display Restaurents in jtable  
     public void findEntityRestaurants()
    {
        String restaurants="restaurant";
        ArrayList<Entity> entity = ListEntityRestaurants(restaurants);
        DefaultTableModel modelRestaurants = new DefaultTableModel();
        modelRestaurants.setColumnIdentifiers(new Object[]{"Id","Name","Type","Location","Phone","Email","Website"});
        Object[] row = new Object[7];
        
        for(int i = 0; i < entity.size(); i++)
        {
            row[0] = entity.get(i).getId();
            row[1] = entity.get(i).getName();
            row[2] = entity.get(i).getType();
            row[3] = entity.get(i).getLocation();
            row[4] = entity.get(i).getPhone();
            row[5] = entity.get(i).getEmail();
            row[6] = entity.get(i).getWebsite();
            modelRestaurants.addRow(row);
        }
       jTable1.setModel(modelRestaurants);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        searchResultsNoticeLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        banksSearchButton = new javax.swing.JButton();
        collegesSearchButton = new javax.swing.JButton();
        hospitalsSearchButton = new javax.swing.JButton();
        restaurantsSearchButton = new javax.swing.JButton();
        atmSearchButton = new javax.swing.JButton();
        universitiesSearchButton = new javax.swing.JButton();
        schoolSearchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        searchlogoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));

        jTable1.setBackground(new java.awt.Color(0, 51, 51));
        jTable1.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Type", "Location", "Phone", "Email", "Website"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        searchField.setFont(new java.awt.Font("Sitka Display", 1, 16)); // NOI18N

        searchButton.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(0, 51, 204));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search-icon (1)32.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(0, 51, 51));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Arrow-Back-icon.png"))); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/clear-locationbar-rtl-icon.png"))); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        searchResultsNoticeLabel.setFont(new java.awt.Font("Sitka Display", 1, 20)); // NOI18N
        searchResultsNoticeLabel.setForeground(new java.awt.Color(0, 51, 204));
        searchResultsNoticeLabel.setText("Search Results . . .");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)), "Special Search Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kalpurush", 1, 18), new java.awt.Color(0, 153, 51))); // NOI18N

        banksSearchButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        banksSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Bank-icon.png"))); // NOI18N
        banksSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banksSearchButtonActionPerformed(evt);
            }
        });

        collegesSearchButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        collegesSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/The-college-icon.png"))); // NOI18N
        collegesSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collegesSearchButtonActionPerformed(evt);
            }
        });

        hospitalsSearchButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hospitalsSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/City-Hospital-32.png"))); // NOI18N
        hospitalsSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalsSearchButtonActionPerformed(evt);
            }
        });

        restaurantsSearchButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        restaurantsSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/City-Restaurant-icon.png"))); // NOI18N
        restaurantsSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantsSearchButtonActionPerformed(evt);
            }
        });

        atmSearchButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        atmSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Finance-Atm-icon32.png"))); // NOI18N
        atmSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atmSearchButtonActionPerformed(evt);
            }
        });

        universitiesSearchButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        universitiesSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Student-Hat-2-icon32.png"))); // NOI18N
        universitiesSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                universitiesSearchButtonActionPerformed(evt);
            }
        });

        schoolSearchButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        schoolSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Science-School-icon.png"))); // NOI18N
        schoolSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolSearchButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel1.setText("ATM's");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Hospitals");

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Banks");

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Universities");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Restaurants");

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Schools");

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Colleges");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atmSearchButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hospitalsSearchButton)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(banksSearchButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(schoolSearchButton)
                    .addComponent(jLabel6))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collegesSearchButton)
                    .addComponent(jLabel7))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(universitiesSearchButton)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(restaurantsSearchButton)
                        .addGap(8, 8, 8)))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(collegesSearchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(atmSearchButton)
                                .addComponent(hospitalsSearchButton)
                                .addComponent(restaurantsSearchButton)
                                .addComponent(schoolSearchButton)
                                .addComponent(banksSearchButton, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(universitiesSearchButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        searchlogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/CreamyGargantuanAlligatorsnappingturtle-max-1mb (1).gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backButton)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(searchButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(searchlogoLabel)))
                                .addGap(18, 18, 18)
                                .addComponent(clearButton)
                                .addGap(171, 171, 171))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(searchResultsNoticeLabel)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(searchlogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchResultsNoticeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        findEntity();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Home ob=new Home();
        ob.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void atmSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atmSearchButtonActionPerformed
        // TODO add your handling code here:
        findEntityATM();
    }//GEN-LAST:event_atmSearchButtonActionPerformed

    private void hospitalsSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalsSearchButtonActionPerformed
        // TODO add your handling code here:
        findEntityHospitals();
    }//GEN-LAST:event_hospitalsSearchButtonActionPerformed

    private void banksSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banksSearchButtonActionPerformed
        // TODO add your handling code here:
        findEntityBanks();
    }//GEN-LAST:event_banksSearchButtonActionPerformed

    private void schoolSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolSearchButtonActionPerformed
        // TODO add your handling code here:
        findEntitySchools();
    }//GEN-LAST:event_schoolSearchButtonActionPerformed

    private void collegesSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collegesSearchButtonActionPerformed
        // TODO add your handling code here:
        findEntityColleges();
    }//GEN-LAST:event_collegesSearchButtonActionPerformed

    private void universitiesSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_universitiesSearchButtonActionPerformed
        // TODO add your handling code here:
        findEntityUniversities();
    }//GEN-LAST:event_universitiesSearchButtonActionPerformed

    private void restaurantsSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantsSearchButtonActionPerformed
        // TODO add your handling code here:
        findEntityRestaurants();
    }//GEN-LAST:event_restaurantsSearchButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        searchField.setText("");
        
    }//GEN-LAST:event_clearButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atmSearchButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton banksSearchButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton collegesSearchButton;
    private javax.swing.JButton hospitalsSearchButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton restaurantsSearchButton;
    private javax.swing.JButton schoolSearchButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchResultsNoticeLabel;
    private javax.swing.JLabel searchlogoLabel;
    private javax.swing.JButton universitiesSearchButton;
    // End of variables declaration//GEN-END:variables
}
