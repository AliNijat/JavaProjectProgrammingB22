package Day32_Arrays_Split;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";

        String zones = " us-east-1, us-west-2, us-west-1";

        System.out.println("Starting developing of esty app to AWS zones ....");
        String [] zonesToDeploy = zones.split(",");

        for (String eachZone : zonesToDeploy ) {
            System.out.println("Deploying [" + app + "] to " + eachZone + "...");
            System.out.println("Deployment completed for <" + eachZone +">" );
        }

        System.out.println("---->>All deployment complete, traffic enabled<<----");
    }
}
