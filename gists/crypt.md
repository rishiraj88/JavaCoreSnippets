try {
          MessageDigest digest = MessageDigest.getInstance("SHA-256");
          byte[] encodedhash = digest.digest(data.getBytes(StandardCharsets.UTF_8));
          return new String(Hex.encodeHex(encodedhash));
}
