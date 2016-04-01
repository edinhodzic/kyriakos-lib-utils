package io.otrl.library.utils

// TODO test this
object ManifestUtils {

  def simpleName[T](manifest: Manifest[T]) : String =
    manifest.runtimeClass.getSimpleName.toLowerCase

}
