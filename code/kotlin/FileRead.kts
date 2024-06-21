import java.nio.file.Paths
import java.nio.file.Files

val file_path = Paths.get(System.getProperty("user.dir"), "code", "file.txt")
println(Files.readString(file_path))