package com.example.addon;

import com.yourwebsitespace.solehack.Category;
import com.yourwebsitespace.solehack.Module;

public class CustomFunModule extends Module {
    public CustomFunModule() {
        // Name of the module and its category tab in your client
        super("FunFeature", Category.ADDONS);
    }

    @Override
    protected void onUpdate() {
        // Your custom module logic runs here every tick when enabled!
    }
}