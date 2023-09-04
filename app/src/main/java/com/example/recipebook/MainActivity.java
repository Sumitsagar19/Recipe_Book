package com.example.recipebook;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recipebook.Adapter.FamousAdapter;
import com.example.recipebook.Modal.modals;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
EditText editText;
TextView textView;

Toolbar toolbar;
DrawerLayout drawerLayout;
NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        editText = findViewById(R.id.editTextText);
        textView = findViewById(R.id.textView7);

        ArrayList<modals> list = new ArrayList<>();

        list.add(new modals("Aloo Gobi","2 medium potatoes, peeled and cubed\n" +
                "2 cups cauliflower florets\n" +
                "1 medium onion, finely chopped\n" +
                "1 medium tomato, chopped\n" +
                "2-3 cloves garlic, minced\n" +
                "1-inch piece of ginger, minced\n" +
                "1 green chili, slit (adjust to taste)\n" +
                "1/2 teaspoon turmeric powder\n" +
                "1 teaspoon cumin seeds\n" +
                "1 teaspoon coriander powder\n" +
                "1/2 teaspoon cumin powder\n" +
                "1/2 teaspoon red chili powder (adjust to taste)\n" +
                "1/2 teaspoon garam masala\n" +
                "Salt to taste\n" +
                "2-3 tablespoons oil or ghee\n" +
                "Fresh cilantro leaves, chopped for garnishing","\n" +
                "Preparation:\n" +
                "\n" +
                "Wash and peel the potatoes. Cut them into cubes.\n" +
                "Separate the cauliflower into florets.\n" +
                "Chop the onion, tomato, ginger, and garlic.\n" +
                "Parboil Potatoes and Cauliflower:\n" +
                "\n" +
                "Fill a pot with water and bring it to a boil.\n" +
                "Add the potato cubes and cauliflower florets.\n" +
                "Parboil them for about 5 minutes until they are slightly tender.\n" +
                "Drain the water and set the vegetables aside.\n" +
                "Sautéing:\n" +
                "\n" +
                "In a large pan or skillet, heat oil or ghee over medium heat.\n" +
                "Add cumin seeds and let them sizzle for a few seconds.\n" +
                "Add chopped onions and sauté until they turn golden brown.\n" +
                "Aromatic Spices:\n" +
                "\n" +
                "Add minced ginger, garlic, and green chili. Sauté for a minute until fragrant.\n" +
                "Tomato and Spices:\n" +
                "\n" +
                "Add chopped tomatoes and cook until they turn soft and the oil starts to separate.\n" +
                "Add turmeric, coriander powder, cumin powder, red chili powder, and salt. Mix well and cook for a couple of minutes.\n" +
                "Potatoes and Cauliflower:\n" +
                "\n" +
                "Add the parboiled potatoes and cauliflower to the pan. Mix gently to coat them with the spices.\n" +
                "Cooking:\n" +
                "\n" +
                "Cover the pan with a lid and let the vegetables cook on low to medium heat. Stir occasionally to prevent sticking. If needed, you can sprinkle a little water.\n" +
                "Finishing Touches:\n" +
                "\n" +
                "Once the vegetables are fully cooked and tender, add garam masala and mix well. Cook for an additional 2-3 minutes.\n" +
                "Garnish:\n" +
                "\n" +
                "Turn off the heat and garnish with freshly chopped cilantro leaves.\n" +
                "Serving:\n" +
                "\n" +
                "Your delicious Aloo Gobi is ready to be served! It goes well with roti, naan, rice, or any Indian bread.\n" +
                "Enjoy your homemade Aloo Gobi, a classic Indian dish that's flavorful and comforting!",R.drawable.alo_gobi));
        list.add(new modals("Dal Makhni","\n" +
                "1 cup whole black gram (black lentils)\n" +
                "1/4 cup red kidney beans\n" +
                "4 cups water (for soaking)\n" +
                "3 cups water (for cooking)\n" +
                "1 medium onion, finely chopped\n" +
                "2 medium tomatoes, pureed\n" +
                "2 tablespoons butter or ghee\n" +
                "1 tablespoon oil\n" +
                "1 tablespoon ginger-garlic paste\n" +
                "1 green chili, slit (adjust to taste)\n" +
                "1 teaspoon cumin seeds\n" +
                "1/2 teaspoon turmeric powder\n" +
                "1 teaspoon red chili powder (adjust to taste)\n" +
                "1 tablespoon coriander powder\n" +
                "1 teaspoon garam masala\n" +
                "1/2 cup heavy cream\n" +
                "Salt to taste\n" +
                "Fresh cilantro leaves, chopped for garnishing","Preparation:\n" +
                "\n" +
                "Wash the whole black gram (urad dal) and kidney beans (rajma) thoroughly.\n" +
                "Soak them in 4 cups of water overnight or for at least 6-8 hours.\n" +
                "Cooking Dal:\n" +
                "\n" +
                "Drain and rinse the soaked lentils and beans.\n" +
                "In a pressure cooker, add the lentils and beans along with 3 cups of water. Cook for about 6-8 whistles or until they are soft and cooked through.\n" +
                "Tempering:\n" +
                "\n" +
                "In a large pan or pot, heat butter and oil over medium heat.\n" +
                "Add cumin seeds and let them sizzle for a few seconds.\n" +
                "Add chopped onions and sauté until they turn golden brown.\n" +
                "Aromatic Base:\n" +
                "\n" +
                "Add ginger-garlic paste and slit green chili. Sauté for a minute until fragrant.\n" +
                "Tomato Puree and Spices:\n" +
                "\n" +
                "Add tomato puree and cook until the oil starts to separate from the mixture.\n" +
                "Add turmeric powder, red chili powder, coriander powder, and salt. Mix well and cook for a couple of minutes.\n" +
                "Mashed Lentils and Beans:\n" +
                "\n" +
                "Add the cooked lentils and beans to the pan. Mix well and mash some of the lentils against the side of the pan to thicken the gravy.\n" +
                "Simmering:\n" +
                "\n" +
                "Add garam masala and mix.\n" +
                "Add heavy cream and adjust the consistency by adding some water if needed.\n" +
                "Let the dal simmer on low heat for about 15-20 minutes, allowing the flavors to meld together.\n" +
                "Finishing Touches:\n" +
                "\n" +
                "Stir in some more butter for extra richness (optional).\n" +
                "Garnish:\n" +
                "\n" +
                "Turn off the heat and garnish with freshly chopped cilantro leaves.\n" +
                "Serving:\n" +
                "\n" +
                "Your creamy and flavorful Dal Makhani is ready to be served! It pairs wonderfully with naan, roti, or rice.\n" +
                "Enjoy this indulgent and comforting Dal Makhani, a popular North Indian dish that's loved for its rich taste and creamy texture.",R.drawable.dal_makhni));
        list.add(new modals("Mix veg","\n" +
                "For the curry base:\n" +
                "\n" +
                "1 medium onion, finely chopped\n" +
                "2 medium tomatoes, chopped\n" +
                "1 tablespoon ginger-garlic paste\n" +
                "1/4 cup cashew nuts (optional, for creaminess)\n" +
                "1/4 cup yogurt (optional, for creaminess)\n" +
                "2 tablespoons oil or ghee\n" +
                "1 teaspoon cumin seeds\n" +
                "1/2 teaspoon turmeric powder\n" +
                "1 teaspoon red chili powder (adjust to taste)\n" +
                "1 tablespoon coriander powder\n" +
                "1/2 teaspoon garam masala\n" +
                "Salt to taste\n" +
                "For the vegetables:\n" +
                "\n" +
                "Assorted vegetables (e.g., carrots, beans, peas, bell peppers, potatoes), chopped","\n" +
                "Preparation:\n" +
                "\n" +
                "Chop all the vegetables into bite-sized pieces.\n" +
                "Blanching Vegetables (optional):\n" +
                "\n" +
                "You can blanch certain vegetables like carrots and beans in boiling water for a few minutes until they are partially cooked. This step is optional but helps retain vibrant colors.\n" +
                "Curry Base:\n" +
                "\n" +
                "In a blender, blend chopped tomatoes and cashew nuts (if using) into a smooth paste. You can also add yogurt to the paste for creaminess.\n" +
                "In a pan, heat oil or ghee over medium heat. Add cumin seeds and let them sizzle.\n" +
                "Add chopped onions and sauté until they turn golden brown.\n" +
                "Aromatic Base:\n" +
                "\n" +
                "Add ginger-garlic paste and sauté for a minute until fragrant.\n" +
                "Tomato-Cashew Paste and Spices:\n" +
                "\n" +
                "Add the tomato-cashew paste to the pan. Cook until the mixture thickens and the oil starts to separate.\n" +
                "Add turmeric powder, red chili powder, coriander powder, garam masala, and salt. Mix well and cook for a couple of minutes.\n" +
                "Cooking Vegetables:\n" +
                "\n" +
                "Add the chopped vegetables to the pan. Mix them well with the spice mixture.\n" +
                "Simmering:\n" +
                "\n" +
                "Cover the pan with a lid and let the vegetables cook on low to medium heat. Stir occasionally to prevent sticking. If needed, you can sprinkle a little water.\n" +
                "Finishing Touches:\n" +
                "\n" +
                "Once the vegetables are cooked to your desired tenderness, taste and adjust the seasoning if necessary.\n" +
                "Garnish:\n" +
                "\n" +
                "You can garnish the mixed vegetable curry with freshly chopped cilantro leaves.\n" +
                "Serving:\n" +
                "\n" +
                "Your flavorful Mixed Vegetable Curry is ready to be served! It goes well with rice, roti, or any Indian bread.\n" +
                "Enjoy this colorful and nutritious Mixed Vegetable Curry, a versatile dish that can be customized with your favorite combination of vegetables.",R.drawable.mix_veg));
        list.add(new modals("Shai Paneer","For the curry base:\n" +
                "\n" +
                "200g paneer (Indian cottage cheese), cubed\n" +
                "1 medium onion, finely chopped\n" +
                "2 medium tomatoes, chopped\n" +
                "1 tablespoon ginger-garlic paste\n" +
                "1/4 cup cashew nuts\n" +
                "2 tablespoons oil or ghee\n" +
                "1 teaspoon cumin seeds\n" +
                "1/2 teaspoon turmeric powder\n" +
                "1 teaspoon red chili powder (adjust to taste)\n" +
                "1 tablespoon coriander powder\n" +
                "1/2 teaspoon garam masala\n" +
                "1/2 teaspoon cardamom powder\n" +
                "Salt to taste\n" +
                "1/4 cup heavy cream\n" +
                "Fresh coriander leaves, chopped for garnishing\n" +
                "For the paste:\n" +
                "\n" +
                "1/4 cup milk\n" +
                "1/4 teaspoon saffron strands (soaked)","Preparation:\n" +
                "\n" +
                "Cut the paneer into cubes. You can lightly fry them in a little oil until golden for added flavor and texture. Soak saffron strands in warm milk for the paste.\n" +
                "Curry Base:\n" +
                "\n" +
                "In a blender, blend chopped tomatoes and cashew nuts into a smooth paste.\n" +
                "Curry Base (Continued):\n" +
                "\n" +
                "In a pan, heat oil or ghee over medium heat. Add cumin seeds and let them sizzle.\n" +
                "Add chopped onions and sauté until they turn golden brown.\n" +
                "Aromatic Base:\n" +
                "\n" +
                "Add ginger-garlic paste and sauté for a minute until fragrant.\n" +
                "Tomato-Cashew Paste and Spices:\n" +
                "\n" +
                "Add the tomato-cashew paste to the pan. Cook until the mixture thickens and the oil starts to separate.\n" +
                "Add turmeric powder, red chili powder, coriander powder, garam masala, cardamom powder, and salt. Mix well and cook for a couple of minutes.\n" +
                "Creamy Touch:\n" +
                "\n" +
                "Add heavy cream to the mixture and mix well. This will make the curry rich and creamy.\n" +
                "Paneer and Saffron Paste:\n" +
                "\n" +
                "Add the paneer cubes to the pan and mix gently, ensuring the paneer is coated with the sauce.\n" +
                "Saffron Paste:\n" +
                "\n" +
                "Add the saffron-milk paste to the curry. This imparts a beautiful color and flavor.\n" +
                "Simmering:\n" +
                "\n" +
                "Let the shahi paneer simmer on low heat for a few minutes, allowing the flavors to meld together and the paneer to absorb the flavors.\n" +
                "Garnish:\n" +
                "\n" +
                "Turn off the heat and garnish with freshly chopped coriander leaves.\n" +
                "Serving:\n" +
                "\n" +
                "Your delectable Shahi Paneer is ready to be served! It's best enjoyed with naan, roti, or rice.\n" +
                "Indulge in the richness of this Shahi Paneer, a creamy and aromatic dish that's fit for special occasions or when you're craving something truly delightful.",R.drawable.shai_paneer));
        list.add(new modals("Soya Chap","\n" +
                "For the soya chaap:\n" +
                "\n" +
                "200g soya chaap sticks\n" +
                "Water for boiling\n" +
                "Salt for boiling\n" +
                "For the marinade:\n" +
                "\n" +
                "1/4 cup yogurt\n" +
                "1 tablespoon ginger-garlic paste\n" +
                "1 teaspoon red chili powder (adjust to taste)\n" +
                "1/2 teaspoon turmeric powder\n" +
                "1 teaspoon garam masala\n" +
                "1 teaspoon coriander powder\n" +
                "Salt to taste\n" +
                "1 tablespoon oil\n" +
                "For the gravy:\n" +
                "\n" +
                "2 tablespoons oil or ghee\n" +
                "1 medium onion, finely chopped\n" +
                "2 medium tomatoes, chopped\n" +
                "1 teaspoon cumin seeds\n" +
                "1 tablespoon ginger-garlic paste\n" +
                "1 green chili, slit (adjust to taste)\n" +
                "1/2 teaspoon turmeric powder\n" +
                "1 teaspoon red chili powder (adjust to taste)\n" +
                "1 teaspoon coriander powder\n" +
                "1/2 teaspoon garam masala\n" +
                "Salt to taste\n" +
                "1/4 cup heavy cream (optional)\n" +
                "Fresh coriander leaves, chopped for garnishing","Preparing Soya Chaap:\n" +
                "\n" +
                "Boil water with a pinch of salt. Add the soya chaap sticks and boil for about 5-7 minutes to soften them.\n" +
                "Drain the water and let the chaap sticks cool.\n" +
                "Marinade:\n" +
                "\n" +
                "In a bowl, mix yogurt, ginger-garlic paste, red chili powder, turmeric powder, garam masala, coriander powder, salt, and oil to form a marinade.\n" +
                "Marinating Soya Chaap:\n" +
                "\n" +
                "Coat the boiled soya chaap sticks with the marinade. Let them marinate for at least 30 minutes to an hour.\n" +
                "Grilling Soya Chaap:\n" +
                "\n" +
                "Preheat a grill pan or use a regular pan. Cook the marinated chaap sticks on medium heat until they are golden and slightly charred on the edges. You can also use a little oil while grilling for added flavor.\n" +
                "Gravy:\n" +
                "\n" +
                "In a separate pan, heat oil or ghee. Add cumin seeds and let them sizzle.\n" +
                "Add chopped onions and sauté until they turn golden brown.\n" +
                "Aromatic Base:\n" +
                "\n" +
                "Add ginger-garlic paste and green chili. Sauté for a minute until fragrant.\n" +
                "Tomatoes and Spices:\n" +
                "\n" +
                "Add chopped tomatoes and cook until they turn soft and the oil starts to separate.\n" +
                "Add turmeric powder, red chili powder, coriander powder, garam masala, and salt. Mix well and cook for a couple of minutes.\n" +
                "Making the Gravy:\n" +
                "\n" +
                "Blend the cooked tomato mixture to make a smooth gravy. You can strain it for a smoother texture if desired.\n" +
                "Simmering:\n" +
                "\n" +
                "Transfer the blended gravy back to the pan. Add a little water if needed and bring it to a simmer.\n" +
                "Adding Cream (Optional):\n" +
                "\n" +
                "If using heavy cream, you can add it at this stage to make the gravy richer and creamier.\n" +
                "Adding Soya Chaap:\n" +
                "\n" +
                "Gently add the grilled soya chaap sticks to the simmering gravy. Let them cook in the gravy for a few minutes, absorbing the flavors.\n" +
                "Finishing Touches:\n" +
                "\n" +
                "Adjust the seasoning if needed. If the gravy is too thick, you can add a little water to reach your desired consistency.\n" +
                "Garnish:\n" +
                "\n" +
                "Turn off the heat and garnish with freshly chopped coriander leaves.\n" +
                "Serving:\n" +
                "\n" +
                "Your delicious Soya Chaap is ready to be served! Enjoy it with naan, roti, or rice.\n" +
                "Savor the flavors of this protein-packed Soya Chaap, a popular vegetarian dish known for its texture and taste resemblance to meat.",R.drawable.soya_chap));
        list.add(new modals("Mutter Paneer","\n" +
                "200g paneer (Indian cottage cheese), cubed\n" +
                "1 cup green peas (fresh or frozen)\n" +
                "2 medium onions, finely chopped\n" +
                "2 medium tomatoes, chopped\n" +
                "1 tablespoon ginger-garlic paste\n" +
                "1/4 cup cashew nuts\n" +
                "2 tablespoons oil or ghee\n" +
                "1 teaspoon cumin seeds\n" +
                "1/2 teaspoon turmeric powder\n" +
                "1 teaspoon red chili powder (adjust to taste)\n" +
                "1 tablespoon coriander powder\n" +
                "1/2 teaspoon garam masala\n" +
                "Salt to taste\n" +
                "1/4 cup heavy cream (optional)\n" +
                "Fresh coriander leaves, chopped for garnishing","Preparation:\n" +
                "\n" +
                "Cut the paneer into cubes.\n" +
                "If using fresh peas, blanch them in boiling water for a few minutes until tender. If using frozen peas, you can skip this step.\n" +
                "Curry Base:\n" +
                "\n" +
                "In a blender, blend chopped tomatoes and cashew nuts into a smooth paste.\n" +
                "Curry Base (Continued):\n" +
                "\n" +
                "In a pan, heat oil or ghee over medium heat. Add cumin seeds and let them sizzle.\n" +
                "Add chopped onions and sauté until they turn golden brown.\n" +
                "Aromatic Base:\n" +
                "\n" +
                "Add ginger-garlic paste and sauté for a minute until fragrant.\n" +
                "Tomato-Cashew Paste and Spices:\n" +
                "\n" +
                "Add the tomato-cashew paste to the pan. Cook until the mixture thickens and the oil starts to separate.\n" +
                "Add turmeric powder, red chili powder, coriander powder, garam masala, and salt. Mix well and cook for a couple of minutes.\n" +
                "Cooking Peas and Paneer:\n" +
                "\n" +
                "Add the green peas to the pan. Mix them well with the spice mixture and let them cook for a few minutes.\n" +
                "Adding Paneer:\n" +
                "\n" +
                "Gently add the paneer cubes to the pan. Mix gently, ensuring the paneer is coated with the sauce.\n" +
                "Creamy Touch (Optional):\n" +
                "\n" +
                "If using heavy cream, you can add it at this stage to make the gravy richer and creamier.\n" +
                "Simmering:\n" +
                "\n" +
                "Let the matar paneer simmer on low heat for a few minutes, allowing the flavors to meld together and the paneer to absorb the flavors.\n" +
                "Garnish:\n" +
                "\n" +
                "Turn off the heat and garnish with freshly chopped coriander leaves.\n" +
                "Serving:\n" +
                "\n" +
                "Your delightful Matar Paneer is ready to be served! Enjoy it with naan, roti, or rice.\n" +
                "Savor the comforting flavors of Matar Paneer, a popular North Indian dish that combines tender green peas and creamy paneer in a rich and aromatic tomato-based gravy.",R.drawable.mater_paneer));
        list.add(new modals("Chole","\n" +
                "For cooking the chickpeas:\n" +
                "\n" +
                "1 cup dried chickpeas (garbanzo beans)\n" +
                "Water for soaking\n" +
                "4 cups water (for cooking)\n" +
                "1 teaspoon baking soda (optional, for soaking)\n" +
                "For the curry:\n" +
                "\n" +
                "2 tablespoons oil or ghee\n" +
                "1 large onion, finely chopped\n" +
                "2 medium tomatoes, chopped\n" +
                "1 tablespoon ginger-garlic paste\n" +
                "2 green chilies, slit (adjust to taste)\n" +
                "1 teaspoon cumin seeds\n" +
                "2 teaspoons ground coriander\n" +
                "1 teaspoon ground cumin\n" +
                "1/2 teaspoon turmeric powder\n" +
                "1 teaspoon red chili powder (adjust to taste)\n" +
                "1 teaspoon garam masala\n" +
                "1 teaspoon dried fenugreek leaves (kasuri methi)\n" +
                "Salt to taste\n" +
                "Fresh coriander leaves, chopped for garnishing\n" +
                "Lemon wedges for serving","\n" +
                "Preparing Chickpeas:\n" +
                "\n" +
                "Wash the dried chickpeas and soak them in water overnight. If using, add baking soda to the soaking water.\n" +
                "Rinse the soaked chickpeas well and drain.\n" +
                "Cooking Chickpeas:\n" +
                "\n" +
                "In a pressure cooker, add the soaked chickpeas and 4 cups of water. Cook for about 6-8 whistles or until they are soft and cooked through. If not using a pressure cooker, cook the chickpeas in a pot until tender. Drain and set aside.\n" +
                "Curry Base:\n" +
                "\n" +
                "In a pan, heat oil or ghee over medium heat. Add cumin seeds and let them sizzle.\n" +
                "Add chopped onions and sauté until they turn golden brown.\n" +
                "Aromatic Base:\n" +
                "\n" +
                "Add ginger-garlic paste and green chilies. Sauté for a minute until fragrant.\n" +
                "Tomatoes and Spices:\n" +
                "\n" +
                "Add chopped tomatoes and cook until they turn soft and the oil starts to separate.\n" +
                "Add ground coriander, ground cumin, turmeric powder, red chili powder, and salt. Mix well and cook for a couple of minutes.\n" +
                "Adding Chickpeas:\n" +
                "\n" +
                "Add the cooked chickpeas to the pan. Mix well with the spice mixture.\n" +
                "Simmering and Flavoring:\n" +
                "\n" +
                "Add garam masala and dried fenugreek leaves (kasuri methi). Mix well.\n" +
                "Mashing (Optional):\n" +
                "\n" +
                "You can mash some of the chickpeas with the back of a spoon to thicken the gravy if desired.\n" +
                "Simmering:\n" +
                "\n" +
                "Let the chole simmer on low heat for about 10-15 minutes to allow the flavors to meld together.\n" +
                "Garnish:\n" +
                "\n" +
                "Turn off the heat and garnish with freshly chopped coriander leaves.\n" +
                "Serving:\n" +
                "\n" +
                "Your flavorful Chole is ready to be served! Enjoy it with bhature, rice, or any Indian bread. Serve with lemon wedges on the side.\n" +
                "Indulge in the authentic taste of Chole, a popular North Indian dish made from tender chickpeas cooked in a rich and aromatic spiced tomato gravy.",R.drawable.chole));
        list.add(new modals("Palak Paneer","\n" +
                "For the paneer:\n" +
                "\n" +
                "200g paneer (Indian cottage cheese), cubed\n" +
                "Water for soaking paneer (optional)\n" +
                "1/4 teaspoon turmeric powder\n" +
                "A pinch of salt\n" +
                "For the spinach (palak) puree:\n" +
                "\n" +
                "250g fresh spinach leaves, washed and cleaned\n" +
                "Water for blanching and ice water bath\n" +
                "For the curry:\n" +
                "\n" +
                "2 tablespoons oil or ghee\n" +
                "1 large onion, finely chopped\n" +
                "2 medium tomatoes, chopped\n" +
                "1 tablespoon ginger-garlic paste\n" +
                "2 green chilies, slit (adjust to taste)\n" +
                "1 teaspoon cumin seeds\n" +
                "1 teaspoon ground coriander\n" +
                "1/2 teaspoon ground cumin\n" +
                "1/2 teaspoon turmeric powder\n" +
                "1/2 teaspoon red chili powder (adjust to taste)\n" +
                "1/2 teaspoon garam masala\n" +
                "Salt to taste\n" +
                "1/4 cup heavy cream (optional)\n" +
                "Fresh cream for garnishing (optional)\n" +
                "Fresh coriander leaves, chopped for garnishing\n" +
                "Lemon wedges for serving","\n" +
                "Preparing Paneer:\n" +
                "\n" +
                "Soak the paneer cubes in warm water with a pinch of turmeric and salt for about 10 minutes. This helps soften the paneer and gives it a nice color. Drain and set aside.\n" +
                "Blanching Spinach:\n" +
                "\n" +
                "Bring a pot of water to a boil. Add the spinach leaves and blanch them for about 2 minutes.\n" +
                "Quickly transfer the blanched spinach to an ice water bath to retain the bright green color.\n" +
                "Drain the spinach and blend it into a smooth puree. You can add a little water if needed.\n" +
                "Curry Base:\n" +
                "\n" +
                "In a pan, heat oil or ghee over medium heat. Add cumin seeds and let them sizzle.\n" +
                "Add chopped onions and sauté until they turn golden brown.\n" +
                "Aromatic Base:\n" +
                "\n" +
                "Add ginger-garlic paste and green chilies. Sauté for a minute until fragrant.\n" +
                "Tomatoes and Spices:\n" +
                "\n" +
                "Add chopped tomatoes and cook until they turn soft and the oil starts to separate.\n" +
                "Add ground coriander, ground cumin, turmeric powder, red chili powder, and salt. Mix well and cook for a couple of minutes.\n" +
                "Adding Spinach Puree:\n" +
                "\n" +
                "Add the spinach puree to the pan. Mix well with the spice mixture.\n" +
                "Cooking Paneer:\n" +
                "\n" +
                "Gently add the soaked and drained paneer cubes to the spinach mixture. Mix gently, ensuring the paneer is coated with the sauce.\n" +
                "Simmering and Cream (Optional):\n" +
                "\n" +
                "Let the palak paneer simmer on low heat for about 10 minutes to allow the flavors to meld together.\n" +
                "If using heavy cream, you can add it at this stage to make the curry richer and creamier.\n" +
                "Garam Masala and Finishing:\n" +
                "\n" +
                "Add garam masala and mix well.\n" +
                "Garnish:\n" +
                "\n" +
                "Turn off the heat and garnish with fresh cream (if using) and chopped coriander leaves.\n" +
                "Serving:\n" +
                "\n" +
                "Your delicious Palak Paneer is ready to be served! Enjoy it with naan, roti, or rice. Serve with lemon wedges on the side.\n" +
                "Savor the vibrant and nutritious flavors of Palak Paneer, a classic North Indian dish that combines the goodness of spinach and paneer in a rich and flavorful gravy.",R.drawable.palak_paneer));
        list.add(new modals("Gulab Jamun","\n" +
                "For the Jamun Balls:\n" +
                "\n" +
                "1 cup milk powder\n" +
                "1/4 cup all-purpose flour (maida)\n" +
                "1/4 teaspoon baking soda\n" +
                "2 tablespoons ghee (clarified butter), melted\n" +
                "2-3 tablespoons milk (as needed to make the dough)\n" +
                "Oil or ghee for frying\n" +
                "For the Sugar Syrup:\n" +
                "\n" +
                "2 cups sugar\n" +
                "1 cup water\n" +
                "4-5 green cardamom pods, crushed\n" +
                "A few saffron strands (optional)","Making the Jamun Balls:\n" +
                "\n" +
                "Preparing the Dough:\n" +
                "\n" +
                "In a mixing bowl, combine milk powder, all-purpose flour, and baking soda.\n" +
                "Add melted ghee and mix well. The mixture will be crumbly.\n" +
                "Forming the Dough:\n" +
                "\n" +
                "Gradually add milk, a little at a time, and knead the mixture into a soft and smooth dough. The dough should be slightly sticky.\n" +
                "Resting the Dough:\n" +
                "\n" +
                "Cover the dough with a damp cloth and let it rest for about 15-20 minutes.\n" +
                "Shaping Jamun Balls:\n" +
                "\n" +
                "Divide the dough into small portions and roll them into smooth balls. Make sure there are no cracks on the surface of the balls.\n" +
                "Making the Sugar Syrup:\n" +
                "\n" +
                "Preparing Sugar Syrup:\n" +
                "In a wide pan, combine sugar, water, crushed cardamom pods, and saffron strands (if using).\n" +
                "Bring the mixture to a boil and then let it simmer for about 5-7 minutes until the syrup slightly thickens. It doesn't need to be too thick.\n" +
                "Frying and Soaking:\n" +
                "\n" +
                "Frying Jamun Balls:\n" +
                "\n" +
                "Heat oil or ghee in a deep pan over medium-low heat. The temperature should be low to medium for even cooking.\n" +
                "Gently slide in a few jamun balls and fry them until they turn golden brown, stirring occasionally to ensure even cooking. The jamuns will expand a bit while frying.\n" +
                "Once they are evenly golden brown, remove them using a slotted spoon and drain excess oil.\n" +
                "Soaking in Sugar Syrup:\n" +
                "\n" +
                "Place the fried jamun balls directly into the warm sugar syrup. Let them soak for at least 30 minutes to an hour. The jamuns will absorb the syrup and become soft and spongy.\n" +
                "Serving:\n" +
                "\n" +
                "Garnishing:\n" +
                "\n" +
                "Your Gulab Jamuns are ready to be served! You can garnish them with chopped nuts like pistachios or almonds if desired.\n" +
                "Serving:\n" +
                "\n" +
                "Serve the Gulab Jamuns warm or at room temperature. They are a beloved Indian dessert often served at festivals, weddings, and special occasions.\n" +
                "Enjoy the sweet and aromatic delight of Gulab Jamun, which translates to \"rose-flavored balls,\" although the flavor comes from the sugar syrup rather than roses.",R.drawable.gulab_jamun));
        list.add(new modals("Rasmalai","\n" +
                "Ingredients:\n" +
                "\n" +
                "For the Rasgulla (Cottage Cheese Balls):\n" +
                "\n" +
                "1 liter whole milk\n" +
                "1 tablespoon lemon juice or vinegar\n" +
                "1/4 teaspoon cardamom powder\n" +
                "1 cup sugar\n" +
                "4 cups water\n" +
                "For the Rabri (Milk Syrup):\n" +
                "\n" +
                "1 liter whole milk\n" +
                "1/2 cup sugar (adjust to taste)\n" +
                "1/4 teaspoon cardamom powder\n" +
                "A pinch of saffron strands (soaked in warm milk)\n" +
                "For Garnishing:\n" +
                "\n" +
                "Chopped nuts (pistachios, almonds)\n" +
                "Saffron strands","\n" +
                "Making the Rasgulla (Cottage Cheese Balls):\n" +
                "\n" +
                "Preparing Paneer:\n" +
                "\n" +
                "Heat the milk in a heavy-bottomed pan and bring it to a boil.\n" +
                "Add lemon juice or vinegar gradually while stirring until the milk curdles.\n" +
                "Once the curds have separated from the whey, strain through a muslin cloth.\n" +
                "Draining and Kneading Paneer:\n" +
                "\n" +
                "Tie the muslin cloth with the curds in it and hang it for about 30 minutes to drain excess whey.\n" +
                "After draining, place the paneer on a clean surface and knead it until smooth.\n" +
                "Shaping Rasgulla:\n" +
                "\n" +
                "Divide the paneer into small equal-sized portions and shape them into smooth balls.\n" +
                "Making Sugar Syrup:\n" +
                "\n" +
                "In a wide pan, dissolve the sugar in 4 cups of water. Bring it to a boil.\n" +
                "Cooking Rasgulla:\n" +
                "\n" +
                "Gently add the paneer balls to the boiling sugar syrup.\n" +
                "Cover and cook for about 15-20 minutes on medium heat. The rasgullas will puff up and double in size.\n" +
                "Draining Rasgulla:\n" +
                "\n" +
                "Once the rasgullas are cooked, remove them from the syrup and place them in a bowl of cold water. This helps in cooling and retaining their shape.\n" +
                "Making the Rabri (Milk Syrup):\n" +
                "\n" +
                "Preparing Rabri:\n" +
                "\n" +
                "In a heavy-bottomed pan, bring the milk to a boil and then let it simmer on low heat.\n" +
                "Stir occasionally to prevent sticking and reduce the milk to about half of its original quantity.\n" +
                "Adding Flavor:\n" +
                "\n" +
                "Add sugar, cardamom powder, and saffron strands soaked in milk to the reduced milk. Mix well.\n" +
                "Assembling Ras Malai:\n" +
                "\n" +
                "Squeezing Rasgulla:\n" +
                "\n" +
                "Gently squeeze the cooled rasgullas to remove excess syrup.\n" +
                "Placing in Rabri:\n" +
                "\n" +
                "Drop the squeezed rasgullas into the prepared rabri. Let them soak for a few hours in the fridge. The rasgullas will absorb the flavors of the rabri.\n" +
                "Garnishing:\n" +
                "\n" +
                "Garnish with chopped nuts and saffron strands before serving.\n" +
                "Serving:\n" +
                "\n" +
                "Your delightful Ras Malai is ready to be enjoyed! Serve it chilled as a refreshing dessert.\n" +
                "Indulge in the exquisite flavors of Ras Malai, a traditional Indian sweet made with soft rasgulla soaked in creamy rabri, garnished with nuts and saffron.",R.drawable.rasmalai));




        recyclerView.setAdapter(new FamousAdapter(list,this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));



        // button
        textView.setOnClickListener(v -> {
       Intent intent = new Intent(MainActivity.this, listActivity.class);
       startActivity(intent);
        });
        editText.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, listActivity.class);
            startActivity(intent);
        });



        drawerLayout= findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation);
        toolbar= findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle
                (this,drawerLayout,toolbar,R.string.navigation_open,R.string.navigation_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

               if (id==R.id.home){
                   Toast.makeText(MainActivity.this, "home", Toast.LENGTH_SHORT).show();
               }
               else if (id==R.id.All_recipe){
                   Intent intent = new Intent(MainActivity.this, listActivity.class);
                   startActivity(intent);

               } else if (id==R.id.About) {
                   Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();
               }

                return true;
            }

        });

    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }

        else super.onBackPressed();

    }
}