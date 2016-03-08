package casasmap.com.retromania7;

import casasmap.com.retromania7.models.UdacityCatalog;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ramiro on 3/8/16.
 */
public interface UdacityService {
    public static final String BASE_URL = "https://www.udacity.com/public-api/v0/";

    @GET("courses")
    Call<UdacityCatalog> listCatalog();
}
