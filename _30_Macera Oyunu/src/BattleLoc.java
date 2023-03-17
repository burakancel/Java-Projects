import java.util.Random;

public abstract class BattleLoc extends  Location{
    private Obstacle obstacle;
    private String award;

    public int getMaxObsatcle() {
        return maxObsatcle;
    }

    public void setMaxObsatcle(int maxObsatcle) {
        this.maxObsatcle = maxObsatcle;
    }

    private int maxObsatcle;

    public BattleLoc(Player player, String name,Obstacle obstacle,String award,int maxObsatcle) {
        super(player, name);
        this.obstacle=obstacle;
        this.award=award;
        this.maxObsatcle=maxObsatcle;
    }
    @Override
    public boolean onLocation(){
        int obsNumber=this.randomObstacleNumber();
        System.out.println("Şu an Buradasınız "+this.getName());
        System.out.println("Dikkatli Ol Burada "+obsNumber+"tane "+this.getObstacle().getName()+"Yaşıyor");
        System.out.println(" -S-avaş Veya -K-aç  : ");

        String selectCase =input.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("S")&&combat(obsNumber)){
            System.out.println("Savaş İşlemleri Olacak");

                System.out.println(this.getName()+"Mağaradaki Tüm Düşmanları Yendiniz");
                return true;

        }
        if (this.getPlayer().getHealth()<=0){
            System.out.println("Öldünüz");
            return false;
        }


        return  true;
    }
    public boolean combat(int obsNumber){

        for(int i =1;i<=obsNumber;i++){
            this.getObstacle().setHealth(this.getObstacle().getOrginalHealth());
            playerStats();
            obstacleStats();
            while (this.getPlayer().getHealth()>0|| this.getObstacle().getHealth()>0){
                System.out.println("-V-ur veya -K-aç");
                String selectCombat = input.nextLine().toUpperCase();
                if(selectCombat.equals("V")){
                    System.out.println("Siz Vurdunuz");
                    this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getObstacle().getHealth()>0){
                        System.out.println();
                        System.out.println("Canavar Size Vurdu");
                        int obsracleDamage = this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
                        if(obsracleDamage<0){
                            obsracleDamage=0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth()-obsracleDamage);
                        afterHit();
                    }
                    else{
                        return false;
                    }
                }
                return true;
            }
            if(this.getObstacle().getHealth()<this.getPlayer().getHealth()){
                System.out.println("Düşmanı Yendiniz");
                System.out.println(this.getObstacle().getAward()+"Para Kazandınız");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstacle().getAward());
                System.out.println("Güncel Paranız : "+this.getPlayer().getMoney());
            }
        }
        return false;
    }
    public void afterHit(){
        System.out.println("Canınız : "+this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName()+" Canı : "+this.getObstacle().getHealth());
        System.out.println();
    }

    public  void playerStats(){
        System.out.println("Oyuncu Değerleri ");
        System.out.println("----------------");
        System.out.println("Sağlık : "+this.getPlayer().getHealth());
        System.out.println("Silah : "+this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Zırh : "+this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Blok : "+this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Hasar : " +this.getPlayer().getTotalDamage());
        System.out.println("Para : "+this.getPlayer().getMoney());
    }
    public void obstacleStats(){
        System.out.println(this.getObstacle().getName()+"Vampir Değerleri");
        System.out.println("------------");
        System.out.println("Sağlık : "+this.getObstacle().getHealth());
        System.out.println("Hasar : "+this.getObstacle().getDamage());
        System.out.println("Para : "+this.getObstacle().getAward());
    }


    public  int randomObstacleNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxObsatcle())+1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
