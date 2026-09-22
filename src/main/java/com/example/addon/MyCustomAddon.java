package com.example.addon;

import com.yourwebsitespace.solehack.Module;
import com.yourwebsitespace.solehack.api.ISoleHackAddon;
import java.util.ArrayList;
import java.util.List;

public class MyCustomAddon implements ISoleHackAddon {
    @Override
    public String getName() { return "ExampleAddon"; }

    @Override
    public String getAuthor() { return "ExternalDeveloper"; }

    @Override
    public List<Module> getModules() {
        List<Module> modules = new ArrayList<>();

        modules.add(new CustomFunModule());

        return modules;
    }
}