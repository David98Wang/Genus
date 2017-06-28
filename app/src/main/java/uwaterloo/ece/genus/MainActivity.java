package uwaterloo.ece.genus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    FirebaseApp firebaseApp;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeApp();
    }

    private void initializeApp() {
        initializeDatabaseConnection();
    }

    private void initializeDatabaseConnection() {
        mDatabase = FirebaseDatabase.getInstance().getReference();

    }
}
