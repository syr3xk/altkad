import static spark.Spark.*;
import com.google.gson.Gson;
import java.util.List;

public class CharityHttpApi {

    public void start(int portNumber) {

        port(portNumber);   // один порт

        Gson gson = new Gson();
        CharityDAO dao = new CharityDAO();

        // ROOT endpoint (чтобы не было 404)
        get("/", (req, res) -> {
            res.type("application/json");
            return gson.toJson("Charity API is running. Use /charities");
        });

        // GET all charities
        get("/charities", (req, res) -> {
            res.type("application/json");
            List<Charity> charities = dao.getAllCharities();
            return gson.toJson(charities);
        });

        // ADD charity через браузер или Postman
        post("/charities", (req, res) -> {
            res.type("application/json");

            Charity charity = gson.fromJson(req.body(), Charity.class);
            dao.addCharity(charity.getName(), charity.getCity());

            return gson.toJson("Charity added");
        });

        // UPDATE charity name
        put("/charities/:id", (req, res) -> {
            res.type("application/json");

            int id = Integer.parseInt(req.params(":id"));
            Charity charity = gson.fromJson(req.body(), Charity.class);

            dao.updateCharity(id, charity.getName());

            return gson.toJson("Charity updated");
        });

        // DELETE charity
        delete("/charities/:id", (req, res) -> {
            res.type("application/json");

            int id = Integer.parseInt(req.params(":id"));
            dao.deleteCharity(id);

            return gson.toJson("Charity deleted");
        });
    }
}
