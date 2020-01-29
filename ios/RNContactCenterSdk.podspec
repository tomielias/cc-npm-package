
Pod::Spec.new do |s|
  s.name         = "RNContactCenterSdk"
  s.version      = "1.0.0"
  s.summary      = "RNContactCenterSdk"
  s.description  = <<-DESC
                  RNContactCenterSdk
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNContactCenterSdk.git", :tag => "master" }
  s.source_files  = "RNContactCenterSdk/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  