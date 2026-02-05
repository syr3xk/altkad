import com.google.gson.Gson;
import static spark.Spark.*;

public class CharityAPI {

    public static void start() {
        CharityDAO dao = new CharityDAO();
        Gson gson = new Gson();

        get("/charities", (req, res) -> {
            res.type("application/json");
            return gson.toJson(dao.getAllCharities());
        });
    }
}
