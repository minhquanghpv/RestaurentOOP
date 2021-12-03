
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class googleMapAPI {
    public static void main(String[] args) throws IOException {
        // Reference - https://developers.google.com/maps/documentation/distancematrix/
        URL url = new URL("https://maps.googleapis.com/maps/api/distancematrix/json?origins=GaHaiPhong&destinations=NhaHatLonHaiPhong&language=vi&key=AIzaSyDWR76_7KUbq4Pi5u8aQ81u-vZ8pRBbMds");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        String line, outputString = "";
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
        while ((line = reader.readLine()) != null) {
            outputString += line += "\n";
        }
        System.out.println(outputString);
    }
}
