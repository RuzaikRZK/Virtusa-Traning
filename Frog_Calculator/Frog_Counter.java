
public abstract class Frog_Counter {
    
    public abstract double Count_Distance(double time);
    
    public abstract double Count_Time(double distance);
    
        
}

class Frog_Calculation extends Frog_Counter{

    private double discal,timecal;
    @Override
    public double Count_Distance(double time) {
       
        if(time==1.0){
        
            discal = 5.0;
        
        }else if(time==2){
            discal=3.0;
        
        }else if(time==5){
            discal=1.0;
        }else{
            
            discal=time*1.125;
            
        }
        
        return discal;
    }

    @Override
    public double Count_Time(double distance) {
        
        if(distance==5.0){
        
            timecal = 1.0;
        
        }else if(distance==3){
            timecal=2.0;
        
        }else if(distance==1){
            timecal=5.0;
        }else{
            
            timecal=distance*0.88;
            
        }
        
        return timecal;
    }


}

class Run_frog{
    public static void main(String[] args) {
        int com,dis,tim;
        Frog_Calculation f = new Frog_Calculation();
        
        Scanner s = new Scanner(System.in);
        System.out.println("Distance - 1 : Time : 2");
        com=s.nextInt();
        
        if(com==1){
        
        Scanner s2  = new Scanner(System.in);
            System.out.println("Enter Time To Calculate Distance :");
            dis=s2.nextInt();
            f.Count_Distance(dis);
            System.out.println("Distance Calculated :"+f.Count_Distance(dis)+"m" );
        
        }else if(com==2){
        
        Scanner s3  = new Scanner(System.in);
            System.out.println("Enter Distance To Calculate Time :");
            tim=s3.nextInt();
            f.Count_Time(tim);
            System.out.println("Time Calculated :"+ f.Count_Time(tim)+"s" );
        
        }else {
        
            System.out.println("System Crash @^&@^&@");
        
        }
        
        
    }


}
