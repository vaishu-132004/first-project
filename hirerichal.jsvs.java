class bts{
    void bang(){
        System.out.println("leader of the group is RM");
    }
}
class boys{
    void seo(){
        System.out.println("team consist of 7 members");
    }
}
class bangtan{
    public static void main(String[] args){
        boys obj=new boys();
        obj.seo();
        bts ap=new bts();
        ap.bang();
    }
}