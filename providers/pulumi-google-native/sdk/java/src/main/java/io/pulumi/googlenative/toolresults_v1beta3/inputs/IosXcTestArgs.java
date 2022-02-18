// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A test of an iOS application that uses the XCTest framework.
 * 
 */
public final class IosXcTestArgs extends io.pulumi.resources.ResourceArgs {

    public static final IosXcTestArgs Empty = new IosXcTestArgs();

    /**
     * Bundle ID of the app.
     * 
     */
    @InputImport(name="bundleId")
    private final @Nullable Input<String> bundleId;

    public Input<String> getBundleId() {
        return this.bundleId == null ? Input.empty() : this.bundleId;
    }

    /**
     * Xcode version that the test was run with.
     * 
     */
    @InputImport(name="xcodeVersion")
    private final @Nullable Input<String> xcodeVersion;

    public Input<String> getXcodeVersion() {
        return this.xcodeVersion == null ? Input.empty() : this.xcodeVersion;
    }

    public IosXcTestArgs(
        @Nullable Input<String> bundleId,
        @Nullable Input<String> xcodeVersion) {
        this.bundleId = bundleId;
        this.xcodeVersion = xcodeVersion;
    }

    private IosXcTestArgs() {
        this.bundleId = Input.empty();
        this.xcodeVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosXcTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bundleId;
        private @Nullable Input<String> xcodeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(IosXcTestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleId = defaults.bundleId;
    	      this.xcodeVersion = defaults.xcodeVersion;
        }

        public Builder setBundleId(@Nullable Input<String> bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        public Builder setBundleId(@Nullable String bundleId) {
            this.bundleId = Input.ofNullable(bundleId);
            return this;
        }

        public Builder setXcodeVersion(@Nullable Input<String> xcodeVersion) {
            this.xcodeVersion = xcodeVersion;
            return this;
        }

        public Builder setXcodeVersion(@Nullable String xcodeVersion) {
            this.xcodeVersion = Input.ofNullable(xcodeVersion);
            return this;
        }

        public IosXcTestArgs build() {
            return new IosXcTestArgs(bundleId, xcodeVersion);
        }
    }
}
