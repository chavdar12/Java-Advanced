rootProject.name = "Java-Advanced"

// Every top-level folder with a src directory is a module, e.g. :001-Stacks-And-Queues
rootDir.listFiles()!!
    .filter { it.isDirectory && !it.name.startsWith(".") && it.resolve("src").isDirectory }
    .sortedBy { it.name }
    .forEach { include(it.name) }
