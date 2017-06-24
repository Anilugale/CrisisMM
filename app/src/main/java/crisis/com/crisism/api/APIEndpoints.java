package crisis.com.crisism.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Arjun on 26-Mar-2017 for CrisisX.
 */

public interface APIEndpoints {

    @GET("place/nearbysearch/json")
    Call<ResponseBody> getAllEmergencyHelpLocations(@Query("location") String location, @Query("radius") int radius, @Query("type") String type, @Query("key") String key);

//    @POST("Emergency/CalculateNearest/")
//    Call<ResponseBody> reportEmergency(@Body CalculateNearest calculateNearest);
//
//    @POST("Registration/Hospital_fcm/")
//    Call<ResponseBody> postToken(@Body SendToken sendToken);
}
