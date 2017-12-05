public class CardLock {
    
    SmartCard cardSwipped;
    boolean lockUnlocked = false;
    boolean studentUnlock = false;
    
    public void swipeCard(SmartCard inputCard) {
        if ((inputCard.staffMember) || (studentUnlock)){
            lockUnlocked = true;
        } else {
            lockUnlocked = false;
        }
        cardSwipped = inputCard;
    }
    
    public SmartCard getLastCardSeen(){
        return cardSwipped;
    }
    
    public boolean isUnlocked() {
        if (lockUnlocked){
            return true;
        }else {
            return false;
        }
    }
    
    public void toggleStudentAccess(){
        studentUnlock = !studentUnlock;
    }
}