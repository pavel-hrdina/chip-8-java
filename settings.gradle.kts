rootProject.name = "chip-8-java"
include("src:main:font")
findProject(":src:main:font")?.name = "font"
