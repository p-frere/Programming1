
public class SmartCard
{
    String owner;
    boolean staffMember = false;
    public SmartCard(String owner){
        this.owner = owner;
    }
    
    public String getOwner(){
        return owner;
    }
    
    public boolean isStaff(){
        if (staffMember){
            return true;
        }else {
            return false;
        }
    }
    
    public void setStaff(boolean state) {
        staffMember = state;
    }
}
