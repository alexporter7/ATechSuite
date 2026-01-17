package com.github.alexporter7.atmaterials.api.material;

import com.github.alexporter7.atmaterials.api.enums.MaterialForm;

import java.util.List;

public record ATMaterial(String name,
                         String label,
                         String chemicalSymbol,
                         List<MaterialForm> forms,
                         int meltingPoint,
                         int weight,
                         int temperature,
                         int tintHexCode) {

}
