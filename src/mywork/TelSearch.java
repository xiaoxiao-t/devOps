package mywork;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.Rectangle;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.TextArea;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.io.*;
import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.awt.Checkbox;
import java.awt.Button;

public class TelSearch extends JFrame {
    public static boolean judge=true;
    JDialog d=new JDialog();
    JLabel jLabel1 = new JLabel();
    JTabbedPane jTabbedPane1 = new JTabbedPane();
    JPanel jPanel1 = new JPanel();
    TextArea textArea1 = new TextArea();
    JComboBox jComboBox1 = new JComboBox();
    JTextField jTextField1 = new JTextField(12);
    JButton jButton1 = new JButton();
    JPanel jPanel2 = new JPanel();
    JLabel jLabel2 = new JLabel();
    JTextField jTextField2 = new JTextField();
    JLabel jLabel3 = new JLabel();
    JTextField jTextField3 = new JTextField();
    JLabel jLabel4 = new JLabel();
    JTextField jTextField4 = new JTextField(12);
    JTextPane jTextPane1 = new JTextPane();
    JTextPane jTextPane2 = new JTextPane();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    JButton jButton6 = new JButton();
    public TelSearch() {
        try {
            jbInit();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        getContentPane().setLayout(null);
        this.getContentPane().setBackground(SystemColor.controlShadow);
        jLabel1.setBackground(SystemColor.activeCaptionBorder);
        jLabel1.setFont(new java.awt.Font("楷体_GB2312", Font.ITALIC, 18));
        jLabel1.setText("电话查询系统");
        jLabel1.setBounds(new Rectangle(4, 1, 465, 40));
        jPanel2.setBackground(SystemColor.controlShadow);
        jPanel2.setLayout(null);
        jLabel2.setFont(new java.awt.Font("宋体", Font.PLAIN, 18));
        jLabel2.setText("姓  名：");
        jLabel2.setBounds(new Rectangle(39, 41, 74, 36));
        jTextField2.setFont(new java.awt.Font("宋体", Font.PLAIN, 16));
        jTextField2.setBounds(new Rectangle(134, 41, 173, 33));
        jLabel3.setFont(new java.awt.Font("宋体", Font.PLAIN, 18));
        jLabel3.setText("地  址：");
        jLabel3.setBounds(new Rectangle(39, 123, 75, 31));
        jTextField3.setFont(new java.awt.Font("宋体", Font.PLAIN, 16));
        jTextField3.setBounds(new Rectangle(134, 122, 264, 32));
        jLabel4.setFont(new java.awt.Font("宋体", Font.PLAIN, 18));
        jLabel4.setText("电话号码：");
        jLabel4.setBounds(new Rectangle(39, 204, 91, 33));
        jTextField4.setFont(new java.awt.Font("宋体", Font.PLAIN, 16));
        jTextField4.setBounds(new Rectangle(135, 204, 172, 32));
        jTextPane1.setBackground(SystemColor.activeCaptionBorder);
        jTextPane1.setText("输入'a'~'z'，区分大小写");
        jTextPane1.setBounds(new Rectangle(337, 41, 96, 57));
        jTextPane2.setBackground(SystemColor.activeCaptionBorder);
        jTextPane2.setText("区号+家庭电话号码或者手机号码，以及紧急电话号码");
        jTextPane2.setBounds(new Rectangle(337, 204, 96, 81));
        jButton2.setBounds(new Rectangle(307, 315, 125, 33));
        jButton2.setFont(new java.awt.Font("宋体", Font.ITALIC, 16));
        jButton2.setText("保存");
        jTextField1.setFont(new java.awt.Font("宋体", Font.PLAIN, 16));
        textArea1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 17));
        textArea1.setBounds(new Rectangle(62, 179, 345, 189));
        jComboBox1.setBounds(new Rectangle(62, 42, 131, 33));
        jTextField1.setBounds(new Rectangle(213, 42, 195, 35));
        jButton1.setBounds(new Rectangle(317, 120, 91, 36));
        jButton1.setMaximumSize(new Dimension(81, 23));
        jButton1.setMinimumSize(new Dimension(81, 23));
        jButton1.setPreferredSize(new Dimension(81, 23));
        jButton1.setText("查询");
        jButton1.addActionListener(new TelSearch_jButton_actionAdapter(this));
        jButton2.addActionListener(new TelSearch_jButton_actionAdapter(this));
        jButton3.addActionListener(new TelSearch_jButton_actionAdapter(this));
        jButton4.addActionListener(new TelSearch_jButton_actionAdapter(this));
        jButton5.addActionListener(new TelSearch_jButton_actionAdapter(this));
        jButton6.addActionListener(new TelSearch_jButton_actionAdapter(this));
        jTabbedPane1.setBackground(SystemColor.activeCaptionBorder);
        jPanel1.setBackground(SystemColor.controlShadow);
        jButton3.setBounds(new Rectangle(62, 120, 103, 35));
        jButton3.setText("按号码排列");
        jButton4.setBounds(new Rectangle(192, 119, 99, 36));
        jButton4.setText("按姓名排列");
        jButton5.setBounds(new Rectangle(358, 386, 104, 31));
        jButton5.setText("退出");
        jButton6.setBounds(new Rectangle(307, 368, 124, 33));
        jButton6.setFont(new java.awt.Font("宋体", Font.ITALIC, 16));
        jButton6.setText("退出");
        jPanel1.add(jComboBox1);
        jPanel1.add(jTextField1);
        jPanel1.add(textArea1);
        jPanel1.add(jButton3);
        jPanel1.add(jButton1);
        jPanel1.add(jButton4);
        jPanel1.add(jButton5);
        jPanel2.add(jLabel2);
        jPanel2.add(jLabel3);
        jPanel2.add(jLabel4);
        jPanel2.add(jTextField2);
        jPanel2.add(jTextField3);
        jPanel2.add(jTextField4);
        jPanel2.add(jTextPane1);
        jPanel2.add(jTextPane2);
        jPanel2.add(jButton2);
        jPanel2.add(jButton6);
        this.getContentPane().add(jTabbedPane1);
        this.getContentPane().add(jLabel1);
        jTabbedPane1.add(jPanel1, "查找");
        jTabbedPane1.add(jPanel2, "添加新用户");
        jPanel1.setLayout(null);
        jTabbedPane1.setBounds(new Rectangle(1, 40, 468, 449));
        jComboBox1.addItem("按电话号码查询");
        jComboBox1.addItem("按姓名查询");
        this.setSize(new Dimension(492,568));
    }

    public static boolean checkString(String str){       //对输入姓名的检查
            char a[]=str.toCharArray();
            if(str.equals(""))return false;
            for(int i=0;i<a.length;i++)
                    if(a[i]==' '||str.length()>16){
                            return false;
                    }
            return true;
    }
    public static boolean checkNumber(String str){       //对输入号码的检查
            if(str.length()!=11&&str.length()!=3&&str.length()!=12)return false;
            try{
                    long in=Long.parseLong(str);
                    if(in<100)return false;
                    return true;
            }catch(NumberFormatException e){
                    return false;
            }
    }
    public void save(String name,String dress,String number) {     //保存
        ObjectOutputStreamextends oo ;
        try {
            oo = new ObjectOutputStreamextends(new FileOutputStream(
                    "book.dat",true));
            User user = new User();
            if(dress.equals(""))
                JOptionPane.showMessageDialog(d, "请输入地址", "请重新输入",
                                              JOptionPane.WARNING_MESSAGE);
            else
                user.setDress(dress);
            if (!checkString(name))
                JOptionPane.showMessageDialog(d, "错误的姓名", "请重新输入",
                                              JOptionPane.WARNING_MESSAGE);
            else
                user.setName(name);
            if (!checkNumber(number))
                JOptionPane.showMessageDialog(d, "错误的电话号码", "请重新输入",JOptionPane.WARNING_MESSAGE);
            else
                user.setNumbers(number);
            if(checkString(name)&&checkNumber(number)){
                LinkList list = new LinkList();
                list.HashNumberList();
                User user2 = list.NumberSearch(number);
                if(judge){
                    if (user2 != null)
                         JOptionPane.showMessageDialog(d, "此号码以存在", "请重新输入",
                                  JOptionPane.WARNING_MESSAGE);
                    else {
                        oo.writeObject(user);
                        JOptionPane.showMessageDialog(d, "保存成功", "成功",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
            oo.close();
        } catch (IOException ex) {
        }
    }

    public void NumberSearch(String str){        //按电话号码查询
        if(!checkNumber(str))
            JOptionPane.showMessageDialog(d,"错误的电话号码","请重新输入",JOptionPane.WARNING_MESSAGE);
        else{
            User user=new User();
            LinkList list=new LinkList();
            list.HashNumberList();
            user=list.NumberSearch(str);
            if(user==null)
                textArea1.setText("此号码不存在");
            else
                textArea1.setText(user.toString());
        }
    }
    public void NameSearch(String str){          //按姓名查询
        if(!checkString(str))
            JOptionPane.showMessageDialog(d,"错误的姓名","请重新输入",JOptionPane.WARNING_MESSAGE);
        else{
            LinkList list=new LinkList();
            list.HashNameList();
            String s="";
            OrderList namelist=new OrderList();
            namelist=list.nameSearch(str);
            Link1 L=new Link1();
            L=namelist.first;
            if(L==null)
                textArea1.setText("此用户不存在");
            else{
                while(L!=null){
                s=s+L.username.toString();
                L=L.next;
            }
            textArea1.setText(s);
            }
        }
    }
    public void NameShow(){            //按姓名排列
        OrderList list=new OrderList();
        try {
            ObjectInputStream oi=new ObjectInputStream(new FileInputStream("book.dat"));
            User a=new User();
            boolean valid=false;
            while(!valid){                                        //读取文件
            try{
                a=(User)oi.readObject();
                list.nameList(a);                               //存入一个顺序链表中
            }catch(EOFException e){
                valid=true;
            }catch(ClassNotFoundException e){
                JDialog d=new JDialog();
                JOptionPane.showMessageDialog(d, "找不到文件", "错误",JOptionPane.WARNING_MESSAGE);
                judge=false;
                valid=true;
            }
            }
          }catch (FileNotFoundException e) {
              JDialog d=new JDialog();
              JOptionPane.showMessageDialog(d, "找不到这个文件", "错误",JOptionPane.WARNING_MESSAGE);
              judge=false;
          } catch (IOException e) {
              JDialog d=new JDialog();
              JOptionPane.showMessageDialog(d, "I/O错误", "错误",JOptionPane.WARNING_MESSAGE);
              judge=false;
          }
          if(judge){
              if(list.show().equals(""))
              textArea1.setText("文件空白");
          else
              textArea1.setText(list.show());
          }
    }
    public void NumberShow(){          //按电话号码排列
        OrderList list=new OrderList();
        try {
            ObjectInputStream oi=new ObjectInputStream(new FileInputStream("book.dat"));
            User a=new User();
            boolean valid=false;
            while(!valid){                                        //读取文件
            try{
                a=(User)oi.readObject();
                list.numberList(a);
            }catch(EOFException e){
                valid=true;
            }catch(ClassNotFoundException e){
                JDialog d=new JDialog();
                JOptionPane.showMessageDialog(d, "找不到文件", "错误",JOptionPane.WARNING_MESSAGE);
                judge=false;
                valid=true;
            }
            }
          }catch (FileNotFoundException e) {
              JDialog d=new JDialog();
              JOptionPane.showMessageDialog(d, "找不到这个文件", "错误",JOptionPane.WARNING_MESSAGE);
              judge=false;
          } catch (IOException e) {
              JDialog d=new JDialog();
              JOptionPane.showMessageDialog(d, "I/O错误", "错误",JOptionPane.WARNING_MESSAGE);
              judge=false;
          }
          if(judge){
              if(list.show().equals(""))
              textArea1.setText("文件空白");
          else
              textArea1.setText(list.show());
          }
    }

    public static void main(String[] args) {
        TelSearch telsearch = new TelSearch();
        telsearch.setVisible(true);
    }

    public void jButton_actionPerformed(ActionEvent e){
        if(e.getSource()==jButton1){
            String str;
            str=(String)jComboBox1.getSelectedItem();
            if(str.equals("按电话号码查询"))
                NumberSearch(jTextField1.getText());
            if(str.equals("按姓名查询"))
                NameSearch(jTextField1.getText());
        }
       if(e.getSource()==jButton2)
           save(jTextField2.getText().trim(),jTextField3.getText().trim(),jTextField4.getText().trim());
       if(e.getSource()==jButton3)
           NumberShow();
       if(e.getSource()==jButton4)
           NameShow();
       if(e.getSource()==jButton5||e.getSource()==jButton6)
           System.exit(0);
    }
}


class TelSearch_jButton_actionAdapter implements ActionListener {
    private TelSearch adaptee;
    TelSearch_jButton_actionAdapter(TelSearch adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton_actionPerformed(e);
    }
}


class User implements Serializable{                 //声明用户USER
        private String name;
        private String dress;
        private String numbers;
        public User(){
                this("","","");
        }
        public User(String name,String dress,String numbers){
                this.name=name;
                this.dress=dress;
                this.numbers=numbers;
        }
        public String getName(){
                return name;
        }
        public String getDress(){
                return dress;
        }
        public String getNumbers(){
                return numbers;
        }
        public void setName(String name){
                this.name=name;
        }
        public void setDress(String dress){
                this.dress=dress;
        }
        public void setNumbers(String numbers){
                this.numbers=numbers;
        }
        public boolean equals(Object x){                          //判断两对象是否相等
                if(this.getClass()!=x.getClass())return false;
                return (this.getNumbers()==((User) x).getNumbers());
        }
        public String toString(){
                return (getName()+"\t\t"+getDress()+"\t\t"+getNumbers()+"\n");
        }
}

class OrderList {                              //顺序链表
            Link1 first=new Link1();
            public OrderList(){                                //构造方法
                    first=null;                                    //头指针指向空
            }
            public void nameList(User a){                     //建立一个以名字顺序排列的链表
                    Link1 newLink1=new Link1();
                    newLink1.username=a;
                    Link1 current=new Link1();
                    Link1 previous=new Link1();
                    current=first;
                    previous=null;
                    while(current!=null&&a.getName().compareTo(current.username.getName())>0){ //以小到大排列
                            previous=current;                                                  //若插入的名字比当前对象名字大
                            current=current.next;                                              //则插到当前对象前
                    }
                    if(previous==null)first=newLink1;
                    else{
                            previous.next=newLink1;

                    }
                    newLink1.next=current;
            }


            public void numberList(User a){                     //建立一个以号码顺序排列的链表
                    Link1 newLink1=new Link1();
                    newLink1.username=a;
                    Link1 current=new Link1();
                    Link1 previous=new Link1();
                    current=first;
                    previous=null;
                    while(current!=null&&a.getNumbers().compareTo(current.username.getNumbers())>0){ //以小到大排列
                            previous=current;                                                        //若插入的号码比当前对象号码大
                            current=current.next;                                                   //则插到当前对象前
                    }
                    if(previous==null)first=newLink1;
                    else{
                            previous.next=newLink1;

                    }
                    newLink1.next=current;
            }
            public String show(){
                    Link1 L=new Link1();
                    L=first;
                    String str="";
                    while(L!=null){
                            str=str+L.username.toString();
                            L=L.next;
                    }
                    return str;
            }

}

 class ObjectOutputStreamextends extends ObjectOutputStream  {              //创建ObjectOutputStreame的子类

         public ObjectOutputStreamextends(OutputStream out) throws IOException {       //构造方法
                 super(out);
         }
         public boolean isEmpty() throws IOException{                               //判断文件是否为空
                 try {
                         ObjectInputStream oo=new ObjectInputStream(new FileInputStream("book.dat"));
                         oo.readObject();
                         return false;
                 } catch (FileNotFoundException e) {
                         return true;
                 }catch(EOFException e){
                         return true;
                 } catch (ClassNotFoundException e) {
                         return false;
                 }
         }
         public void writeStreamHeader() throws IOException{
                         if(isEmpty())super.writeStreamHeader();        //第一次存入，则调用父类方法writeStreamHeader()
                         else
                                  super.reset();                        //不是第一次存对象进文件，调用reset()方法
         }
 }

 class LinkList {                      //声明一个哈希链表
     Link last = new Link(); //链表头指针
     Link first = new Link(); //链表尾指针
     public LinkList() {
         first = null;
         last = null;
         InsertLink();
     }

     public void InsertLink() { //在链表尾部插入新的结点用以增加哈希表的长度
         Link p = new Link();
         if (first == null) { //结点的插入
             first = p;
             last = p;
         } else {
             last.next = p; //结点的插入
             last = p;
         }
     }
     public void HashNameList() {               //构造一个以name为关键字的哈希表
                     TelSearch.judge=true;
                     try {
                                    ObjectInputStream oi=new ObjectInputStream(new FileInputStream("book.dat"));
                                    User a=new User();
                                    boolean valid=false;
                                    while(!valid){                                        //读取文件
                                            try{
                                                    a=(User)oi.readObject();
                                                    InitnameHash(a);                      //数据插入表中
                                    }catch(EOFException e){
                                            valid=true;
                                    }catch(ClassNotFoundException e){
                                        JDialog d=new JDialog();
                                        JOptionPane.showMessageDialog(d, "找不到文件", "错误",JOptionPane.WARNING_MESSAGE);
                                        TelSearch.judge=false;
                                        valid=true;
                                    }
                              }
                            }catch (FileNotFoundException e) {
                                JDialog d=new JDialog();
                                JOptionPane.showMessageDialog(d, "找不到这个文件", "错误",JOptionPane.WARNING_MESSAGE);
                                TelSearch.judge=false;
                            } catch (IOException e) {
                                JDialog d=new JDialog();
                                JOptionPane.showMessageDialog(d, "I/O错误", "错误",JOptionPane.WARNING_MESSAGE);
                                TelSearch.judge=false;
                            }
            }
            public void InitnameHash(User a){                              //数据的插入
                     Link L=new Link();
                     L=first;
                    int H=0;
                    int n=0;
                    char c[]=a.getName().toCharArray();
                    boolean valid=false;
                    while(!valid){
                            if(n<=a.getName().length()-1)
                                   H=H+((int)c[n])%10;
                            if(H>=50||n>a.getName().length()-1)
                            {
                                    if(L.next==null) InsertLink();
                                    L=L.next;
                                    n=0;
                                    H=0;
                            }
                            else{
                                    if(L.a[H]!=null)++n;
                                    else{
                                            L.a[H]=a;
                                            valid=true;
                                    }
                          }
                    }
            }
            public OrderList nameSearch(String str){
                    char c[]=str.toCharArray();
                    boolean k=false;
                    int n=0,H=0;
                    Link L=new Link();
                    L=first;
                    OrderList namelist=new OrderList();
                    while(!k){                         //表的遍历，返回所要求name一样的对象
                            if(n<=str.length()-1)
                                 H=H+((int)c[n])%10;
                            if(H>=50||n>str.length()-1)
                            {
                                    if(L.next==null)break;
                                    L=L.next;
                                    n=0;
                                    H=0;
                            }
                            else{
                                    if(L.a[H]==null)break;
                                    else{
                                            if(str.equals(L.a[H].getName())){
                                                    namelist.nameList(L.a[H]);            //把找到的对象存如顺序链表中
                                            }
                                            ++n;
                                    }
                          }
                    }
                    return namelist;                                    //返回一个顺序链表
    }
            public void HashNumberList(){               //构造一个以name为关键字的哈希表
                     TelSearch.judge=true;
                     try {
                                    ObjectInputStream oi=new ObjectInputStream(new FileInputStream("book.dat"));
                                    User a=new User();
                                    boolean valid=false;
                                    while(!valid){                                        //读取文件
                                            try{
                                                    a=(User)oi.readObject();
                                                    InitNumberHash(a);                              //数据插入表中
                                    }catch(EOFException e){
                                            valid=true;
                                    }catch(ClassNotFoundException e) {
                                        JDialog d=new JDialog();
                                        JOptionPane.showMessageDialog(d, "找不到文件", "错误",JOptionPane.WARNING_MESSAGE);
                                        TelSearch.judge=false;
                                        valid=true;
                                    }
                              }
                            }catch (FileNotFoundException e) {
                                JDialog d=new JDialog();
                                JOptionPane.showMessageDialog(d, "找不到这个文件", "错误",JOptionPane.WARNING_MESSAGE);
                                TelSearch.judge=false;
                            } catch (IOException e) {
                                JDialog d=new JDialog();
                                JOptionPane.showMessageDialog(d, "I/O错误", "错误",JOptionPane.WARNING_MESSAGE);
                                TelSearch.judge=false;
                            }
            }
            public void InitNumberHash(User a){                              //数据的插入
                     Link L=new Link();
                     L=first;
                    int H=0;
                    int n=0;
                    char c[]=a.getNumbers().toCharArray();
                    boolean valid=false;
                    while(!valid){
                            if(n<=a.getNumbers().length()-1)
                                    H=H+((int)c[n])%10;
                            if(H>=50||n>a.getNumbers().length()-1)
                            {
                                    if(L.next==null) InsertLink();
                                    L=L.next;
                                    n=0;
                                    H=0;
                            }
                            else{
                                    if(L.a[H]!=null)++n;
                                    else{
                                            L.a[H]=a;
                                            valid=true;
                                    }
                          }
                    }
            }
            public User NumberSearch(String str){
                    char c[]=str.toCharArray();
                    boolean k=false;
                    int n=0,H=0;
                    Link L=new Link();
                    L=first;
                    User user=new User();
                    user=null;
                    while(!k){                                            //表的遍历，返回所要求name一样的对象
                            if(n<=str.length()-1)
                                H=H+((int)c[n])%10;
                            if(H>=50||n>str.length()-1)
                            {
                                    if(L.next==null)break;
                                    L=L.next;
                                    n=0;
                                    H=0;
                            }
                            else{
                                    if(L.a[H]==null)break;
                                    else{
                                            if(str.equals(L.a[H].getNumbers())){
                                                    user=L.a[H];
                                            }
                                            ++n;
                                    }
                          }
                    }
                    return user;
    }
            public void show(){
                    Link L=new Link();
                    L=first;
                    int i=0;
                    while(i<10){
                            System.out.println(L.a[i]);
                            i++;
                            if(L.next!=null&&i>=10){
                                    L=L.next;
                                    i=0;
                               }
                            }
            }
    }

class Link1 {                  //声明顺序表的结点
            public User username;             //结点elem
            public Link1 next;
}

class Link {       //声明结点
     public User a[];                  //用数组存储哈希表
     public Link next;
     public Link(){
         a=new User[50];
                }
}

class Keyboard {
    static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    public static String getString(){
        try{
            return (in.readLine().trim());
            }catch(IOException e){
                return "0";
                }
            }
}
