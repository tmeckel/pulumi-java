// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.testing_v1.outputs.FileReferenceResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApkResponse {
    /**
     * @return The path to an APK to be installed on the device before the test begins.
     * 
     */
    private final FileReferenceResponse location;
    /**
     * @return The java package for the APK to be installed. Value is determined by examining the application&#39;s manifest.
     * 
     */
    private final String packageName;

    @CustomType.Constructor
    private ApkResponse(
        @CustomType.Parameter("location") FileReferenceResponse location,
        @CustomType.Parameter("packageName") String packageName) {
        this.location = location;
        this.packageName = packageName;
    }

    /**
     * @return The path to an APK to be installed on the device before the test begins.
     * 
     */
    public FileReferenceResponse location() {
        return this.location;
    }
    /**
     * @return The java package for the APK to be installed. Value is determined by examining the application&#39;s manifest.
     * 
     */
    public String packageName() {
        return this.packageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileReferenceResponse location;
        private String packageName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.packageName = defaults.packageName;
        }

        public Builder location(FileReferenceResponse location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder packageName(String packageName) {
            this.packageName = Objects.requireNonNull(packageName);
            return this;
        }        public ApkResponse build() {
            return new ApkResponse(location, packageName);
        }
    }
}
