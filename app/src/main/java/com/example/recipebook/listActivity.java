package com.example.recipebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recipebook.Adapter.ListAdapter;
import com.example.recipebook.Modal.modals;

import java.util.ArrayList;

public class listActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = findViewById(R.id.list_rv);
        toolbar = findViewById(R.id.toolbar);
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
        list.add(new modals("Palak Paneer","\\n\" +\n" +
                "                \"For the paneer:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"200g paneer (Indian cottage cheese), cubed\\n\" +\n" +
                "                \"Water for soaking paneer (optional)\\n\" +\n" +
                "                \"1/4 teaspoon turmeric powder\\n\" +\n" +
                "                \"A pinch of salt\\n\" +\n" +
                "                \"For the spinach (palak) puree:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"250g fresh spinach leaves, washed and cleaned\\n\" +\n" +
                "                \"Water for blanching and ice water bath\\n\" +\n" +
                "                \"For the curry:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"2 tablespoons oil or ghee\\n\" +\n" +
                "                \"1 large onion, finely chopped\\n\" +\n" +
                "                \"2 medium tomatoes, chopped\\n\" +\n" +
                "                \"1 tablespoon ginger-garlic paste\\n\" +\n" +
                "                \"2 green chilies, slit (adjust to taste)\\n\" +\n" +
                "                \"1 teaspoon cumin seeds\\n\" +\n" +
                "                \"1 teaspoon ground coriander\\n\" +\n" +
                "                \"1/2 teaspoon ground cumin\\n\" +\n" +
                "                \"1/2 teaspoon turmeric powder\\n\" +\n" +
                "                \"1/2 teaspoon red chili powder (adjust to taste)\\n\" +\n" +
                "                \"1/2 teaspoon garam masala\\n\" +\n" +
                "                \"Salt to taste\\n\" +\n" +
                "                \"1/4 cup heavy cream (optional)\\n\" +\n" +
                "                \"Fresh cream for garnishing (optional)\\n\" +\n" +
                "                \"Fresh coriander leaves, chopped for garnishing\\n\" +\n" +
                "                \"Lemon wedges for serving","\\n\" +\n" +
                "                \"Preparing Paneer:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Soak the paneer cubes in warm water with a pinch of turmeric and salt for about 10 minutes. This helps soften the paneer and gives it a nice color. Drain and set aside.\\n\" +\n" +
                "                \"Blanching Spinach:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Bring a pot of water to a boil. Add the spinach leaves and blanch them for about 2 minutes.\\n\" +\n" +
                "                \"Quickly transfer the blanched spinach to an ice water bath to retain the bright green color.\\n\" +\n" +
                "                \"Drain the spinach and blend it into a smooth puree. You can add a little water if needed.\\n\" +\n" +
                "                \"Curry Base:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"In a pan, heat oil or ghee over medium heat. Add cumin seeds and let them sizzle.\\n\" +\n" +
                "                \"Add chopped onions and sauté until they turn golden brown.\\n\" +\n" +
                "                \"Aromatic Base:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Add ginger-garlic paste and green chilies. Sauté for a minute until fragrant.\\n\" +\n" +
                "                \"Tomatoes and Spices:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Add chopped tomatoes and cook until they turn soft and the oil starts to separate.\\n\" +\n" +
                "                \"Add ground coriander, ground cumin, turmeric powder, red chili powder, and salt. Mix well and cook for a couple of minutes.\\n\" +\n" +
                "                \"Adding Spinach Puree:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Add the spinach puree to the pan. Mix well with the spice mixture.\\n\" +\n" +
                "                \"Cooking Paneer:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Gently add the soaked and drained paneer cubes to the spinach mixture. Mix gently, ensuring the paneer is coated with the sauce.\\n\" +\n" +
                "                \"Simmering and Cream (Optional):\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Let the palak paneer simmer on low heat for about 10 minutes to allow the flavors to meld together.\\n\" +\n" +
                "                \"If using heavy cream, you can add it at this stage to make the curry richer and creamier.\\n\" +\n" +
                "                \"Garam Masala and Finishing:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Add garam masala and mix well.\\n\" +\n" +
                "                \"Garnish:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Turn off the heat and garnish with fresh cream (if using) and chopped coriander leaves.\\n\" +\n" +
                "                \"Serving:\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Your delicious Palak Paneer is ready to be served! Enjoy it with naan, roti, or rice. Serve with lemon wedges on the side.\\n\" +\n" +
                "                \"Savor the vibrant and nutritious flavors of Palak Paneer, a classic North Indian dish that combines the goodness of spinach and paneer in a rich and flavorful gravy.",R.drawable.palak_paneer));
        list.add(new modals("Gulab Jamun","For the Gulab Jamun Balls:\n" +
                "\n" +
                "1 cup milk powder\n" +
                "1/4 cup all-purpose flour (maida)\n" +
                "1/4 tsp baking soda\n" +
                "2 tbsp ghee (clarified butter)\n" +
                "A pinch of cardamom powder\n" +
                "3-4 tbsp milk (approximately)\n" +
                "Oil or ghee for deep frying\n\n" +
                "For the Sugar Syrup:\n" +
                "\n" +
                "1 cup sugar\n" +
                "1 cup water\n" +
                "A few strands of saffron (optional)\n" +
                "1/2 tsp rose water (optional)","For the Sugar Syrup:\n" +
                "\n" +
                "In a saucepan, combine sugar and water.\n" +
                "Bring it to a boil and let it simmer for 5-7 minutes until it forms a slightly sticky syrup. Add saffron strands and rose water if using. Then, remove it from heat and set aside.\n" +
                "For the Gulab Jamun Balls:\n" +
                "\n" +
                "In a mixing bowl, combine milk powder, all-purpose flour, baking soda, cardamom powder, and ghee.\n" +
                "Gradually add milk while kneading the mixture into a soft and smooth dough. The dough should not be too sticky or too dry. Adjust the milk quantity as needed.\n" +
                "Divide the dough into small equal-sized portions and shape them into smooth, crack-free balls. Make sure there are no cracks, as they may cause the gulab jamuns to break apart during frying.\n" +
                "Heat oil or ghee in a deep pan over medium-low heat. The temperature should be around 160-170°C (320-340°F).\n" +
                "Gently slide the dough balls into the hot oil, frying them in batches to avoid overcrowding. Stir occasionally and fry until they turn golden brown and have a uniform color.\n" +
                "Remove the fried gulab jamun balls using a slotted spoon and drain excess oil by placing them on a paper towel.\n" +
                "To Assemble:\n" +
                "\n" +
                "While the fried gulab jamun balls are still warm, place them directly into the prepared warm sugar syrup.\n" +
                "Let the gulab jamuns soak in the syrup for at least 2 hours or overnight for the best results. They will absorb the syrup and become soft and syrupy.\n" +
                "Serve Gulab Jamun:\n" +
                "\n" +
                "Garnish with chopped pistachios, almonds, or silver leaf (varak) if desired.\n" +
                "Serve warm or at room temperature. Gulab Jamun is a delightful dessert for festivals, special occasions, or any sweet cravings.\n" +
                "Enjoy your homemade Gulab Jamun!",R.drawable.gulab_jamun));
        list.add(new modals("Rasmalai","200g paneer (homemade or store-bought)\n" +
                "1 liter of full-fat milk\n" +
                "1 cup sugar\n" +
                "A few strands of saffron\n" +
                "1/2 teaspoon cardamom powder\n" +
                "1 teaspoon rose water (optional)\n" +
                "Chopped pistachios and almonds for garnish","Start by preparing the paneer:\n" +
                "\n" +
                "Boil 1 liter of milk and let it cool slightly.\n" +
                "Add 1-2 tablespoons of lemon juice or vinegar to curdle the milk.\n" +
                "Once the milk curdles and the whey separates from the curd, strain it using a muslin cloth or strainer.\n" +
                "Rinse the paneer under cold water to remove the sourness of the lemon juice or vinegar.\n" +
                "Squeeze out excess water and knead the paneer until it becomes smooth and pliable.\n" +
                "Divide the paneer into small equal-sized portions and shape them into small discs or balls.\n" +
                "In a large pan, combine:\n" +
                "\n" +
                "1 liter of milk\n" +
                "Sugar (adjust to taste)\n" +
                "Saffron strands\n" +
                "Cardamom powder\n" +
                "Rose water (if using)\n" +
                "Bring the milk to a boil and then reduce the heat to simmer. Add the paneer discs or balls to the simmering milk.\n" +
                "\n" +
                "Cook the paneer in the milk for about 15-20 minutes, occasionally flipping them gently, until they double in size and become spongy.\n" +
                "\n" +
                "Turn off the heat and let the rasmalai cool to room temperature. It will absorb the sweet, saffron-infused milk as it cools.\n" +
                "\n" +
                "Once cooled, refrigerate the rasmalai for a few hours or overnight for best results.\n" +
                "\n" +
                "Garnish with chopped pistachios and almonds before serving.\n" +
                "\n" +
                "Enjoy your homemade rasmalai, a delicious Indian dessert!",R.drawable.rasmalai));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ListAdapter(list,this)) ;


        //back button

        setSupportActionBar(toolbar);
        if (getSupportActionBar()!=null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return  true;
    }
}