object Ciper{

    def main(args:Array[String])={
      val plaintext = "HELLO WORLD"
      val shift = 1

      val encryptedText = cipher(plaintext, shift, encrypt)
      println(s"Encrypted: $encryptedText")

      val decryptedText = cipher(encryptedText, shift, decrypt)
      println(s"Decrypted: $decryptedText")

    }

    def encrypt(text: String, shift: Int): String = {
      text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
      }
    }

    def decrypt(text: String, shift: Int): String = {
      encrypt(text, 26 - shift)
    }

    def cipher(text: String, shift: Int, operation: (String, Int) => String): String = {
      operation(text, shift)
    }
}