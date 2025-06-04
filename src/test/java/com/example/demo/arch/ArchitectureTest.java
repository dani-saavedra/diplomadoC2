package com.example.demo.arch;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;

/*
//Scaffolding = Template
@AnalyzeClasses(packages = "com.example.demo.banco", importOptions = {
        ImportOption.DoNotIncludeTests.class,
        ImportOption.DoNotIncludeJars.class
})
public class ArchitectureTest {

    //Fitness Function: Building evolutionary architecture
    @ArchTest
    public static final ArchRule domainShouldNotHaveAnyDependenciesFromApplication = ArchRuleDefinition
            .noClasses()
            .that().resideInAPackage("..controller..")
            .should().dependOnClassesThat()
            .resideInAPackage("..repositorios..");
    @ArchTest
    public static final ArchRule domainShouldNotHaveAnyDependenciesFromInfra = ArchRuleDefinition
            .noClasses()
            .that().resideInAPackage("..servicios..")
            .should().dependOnClassesThat()
            .resideInAPackage("..controller..");

    @ArchTest
    public static final ArchRule applicationShouldNotHaveAnyDependenciesFromInfra = ArchRuleDefinition
            .noClasses()
            .that().resideInAPackage("..controller..")
            .should().dependOnClassesThat()
            .resideInAPackage("..dominio..");
}

 */
