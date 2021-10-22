class Log {
  def log(message: String, level: String = "INFO"): String = {
    val log1:String=(s"$level: $message")
    log1
  }
}



