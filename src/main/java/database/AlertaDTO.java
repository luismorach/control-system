package database;

public class AlertaDTO {
    private int id ;
    private int port;
    private String IP;   
    
    public void setId(int id){
        this.id=id;
    }    
    public void setPort(int port){
        this.port=port;
    }
    
    
    public void setIP(String IP){
        this.IP=IP;
    }    
     public int getId(){
        return id;
    }     
    public int getPort(){
        return port;
    }
    
    public String getIP(){
        return IP;
    }    
}
