// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.testing_v1.inputs.FileReferenceArgs;
import io.pulumi.googlenative.testing_v1.inputs.IosDeviceFileArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A description of how to set up an iOS device prior to running the test.
 * 
 */
public final class IosTestSetupArgs extends io.pulumi.resources.ResourceArgs {

    public static final IosTestSetupArgs Empty = new IosTestSetupArgs();

    /**
     * iOS apps to install in addition to those being directly tested.
     * 
     */
    @InputImport(name="additionalIpas")
      private final @Nullable Input<List<FileReferenceArgs>> additionalIpas;

    public Input<List<FileReferenceArgs>> getAdditionalIpas() {
        return this.additionalIpas == null ? Input.empty() : this.additionalIpas;
    }

    /**
     * The network traffic profile used for running the test. Available network profiles can be queried by using the NETWORK_CONFIGURATION environment type when calling TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
     * 
     */
    @InputImport(name="networkProfile")
      private final @Nullable Input<String> networkProfile;

    public Input<String> getNetworkProfile() {
        return this.networkProfile == null ? Input.empty() : this.networkProfile;
    }

    /**
     * List of directories on the device to upload to Cloud Storage at the end of the test. Directories should either be in a shared directory (such as /private/var/mobile/Media) or within an accessible directory inside the app's filesystem (such as /Documents) by specifying the bundle ID.
     * 
     */
    @InputImport(name="pullDirectories")
      private final @Nullable Input<List<IosDeviceFileArgs>> pullDirectories;

    public Input<List<IosDeviceFileArgs>> getPullDirectories() {
        return this.pullDirectories == null ? Input.empty() : this.pullDirectories;
    }

    /**
     * List of files to push to the device before starting the test.
     * 
     */
    @InputImport(name="pushFiles")
      private final @Nullable Input<List<IosDeviceFileArgs>> pushFiles;

    public Input<List<IosDeviceFileArgs>> getPushFiles() {
        return this.pushFiles == null ? Input.empty() : this.pushFiles;
    }

    public IosTestSetupArgs(
        @Nullable Input<List<FileReferenceArgs>> additionalIpas,
        @Nullable Input<String> networkProfile,
        @Nullable Input<List<IosDeviceFileArgs>> pullDirectories,
        @Nullable Input<List<IosDeviceFileArgs>> pushFiles) {
        this.additionalIpas = additionalIpas;
        this.networkProfile = networkProfile;
        this.pullDirectories = pullDirectories;
        this.pushFiles = pushFiles;
    }

    private IosTestSetupArgs() {
        this.additionalIpas = Input.empty();
        this.networkProfile = Input.empty();
        this.pullDirectories = Input.empty();
        this.pushFiles = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IosTestSetupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FileReferenceArgs>> additionalIpas;
        private @Nullable Input<String> networkProfile;
        private @Nullable Input<List<IosDeviceFileArgs>> pullDirectories;
        private @Nullable Input<List<IosDeviceFileArgs>> pushFiles;

        public Builder() {
    	      // Empty
        }

        public Builder(IosTestSetupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalIpas = defaults.additionalIpas;
    	      this.networkProfile = defaults.networkProfile;
    	      this.pullDirectories = defaults.pullDirectories;
    	      this.pushFiles = defaults.pushFiles;
        }

        public Builder additionalIpas(@Nullable Input<List<FileReferenceArgs>> additionalIpas) {
            this.additionalIpas = additionalIpas;
            return this;
        }

        public Builder additionalIpas(@Nullable List<FileReferenceArgs> additionalIpas) {
            this.additionalIpas = Input.ofNullable(additionalIpas);
            return this;
        }

        public Builder networkProfile(@Nullable Input<String> networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder networkProfile(@Nullable String networkProfile) {
            this.networkProfile = Input.ofNullable(networkProfile);
            return this;
        }

        public Builder pullDirectories(@Nullable Input<List<IosDeviceFileArgs>> pullDirectories) {
            this.pullDirectories = pullDirectories;
            return this;
        }

        public Builder pullDirectories(@Nullable List<IosDeviceFileArgs> pullDirectories) {
            this.pullDirectories = Input.ofNullable(pullDirectories);
            return this;
        }

        public Builder pushFiles(@Nullable Input<List<IosDeviceFileArgs>> pushFiles) {
            this.pushFiles = pushFiles;
            return this;
        }

        public Builder pushFiles(@Nullable List<IosDeviceFileArgs> pushFiles) {
            this.pushFiles = Input.ofNullable(pushFiles);
            return this;
        }
        public IosTestSetupArgs build() {
            return new IosTestSetupArgs(additionalIpas, networkProfile, pullDirectories, pushFiles);
        }
    }
}
