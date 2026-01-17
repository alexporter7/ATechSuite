package com.github.alexporter7.atmaterials.api.enums;

public enum MaterialQuality {
    SCRAP(""),
    LOW(""),
    MIDGRADE(""),
    HIGH(""),
    PRISTINE("");

    public String colorCode;
    MaterialQuality(String colorCode) {
        this.colorCode = colorCode;
    }
}
