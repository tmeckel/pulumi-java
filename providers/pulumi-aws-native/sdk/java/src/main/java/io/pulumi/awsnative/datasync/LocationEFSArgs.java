// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.datasync.inputs.LocationEFSEc2ConfigArgs;
import io.pulumi.awsnative.datasync.inputs.LocationEFSTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocationEFSArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationEFSArgs Empty = new LocationEFSArgs();

    @InputImport(name="ec2Config", required=true)
      private final Input<LocationEFSEc2ConfigArgs> ec2Config;

    public Input<LocationEFSEc2ConfigArgs> getEc2Config() {
        return this.ec2Config;
    }

    /**
     * The Amazon Resource Name (ARN) for the Amazon EFS file system.
     * 
     */
    @InputImport(name="efsFilesystemArn", required=true)
      private final Input<String> efsFilesystemArn;

    public Input<String> getEfsFilesystemArn() {
        return this.efsFilesystemArn;
    }

    /**
     * A subdirectory in the location's path. This subdirectory in the EFS file system is used to read data from the EFS source location or write data to the EFS destination.
     * 
     */
    @InputImport(name="subdirectory")
      private final @Nullable Input<String> subdirectory;

    public Input<String> getSubdirectory() {
        return this.subdirectory == null ? Input.empty() : this.subdirectory;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<LocationEFSTagArgs>> tags;

    public Input<List<LocationEFSTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LocationEFSArgs(
        Input<LocationEFSEc2ConfigArgs> ec2Config,
        Input<String> efsFilesystemArn,
        @Nullable Input<String> subdirectory,
        @Nullable Input<List<LocationEFSTagArgs>> tags) {
        this.ec2Config = Objects.requireNonNull(ec2Config, "expected parameter 'ec2Config' to be non-null");
        this.efsFilesystemArn = Objects.requireNonNull(efsFilesystemArn, "expected parameter 'efsFilesystemArn' to be non-null");
        this.subdirectory = subdirectory;
        this.tags = tags;
    }

    private LocationEFSArgs() {
        this.ec2Config = Input.empty();
        this.efsFilesystemArn = Input.empty();
        this.subdirectory = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationEFSArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<LocationEFSEc2ConfigArgs> ec2Config;
        private Input<String> efsFilesystemArn;
        private @Nullable Input<String> subdirectory;
        private @Nullable Input<List<LocationEFSTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationEFSArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ec2Config = defaults.ec2Config;
    	      this.efsFilesystemArn = defaults.efsFilesystemArn;
    	      this.subdirectory = defaults.subdirectory;
    	      this.tags = defaults.tags;
        }

        public Builder ec2Config(Input<LocationEFSEc2ConfigArgs> ec2Config) {
            this.ec2Config = Objects.requireNonNull(ec2Config);
            return this;
        }

        public Builder ec2Config(LocationEFSEc2ConfigArgs ec2Config) {
            this.ec2Config = Input.of(Objects.requireNonNull(ec2Config));
            return this;
        }

        public Builder efsFilesystemArn(Input<String> efsFilesystemArn) {
            this.efsFilesystemArn = Objects.requireNonNull(efsFilesystemArn);
            return this;
        }

        public Builder efsFilesystemArn(String efsFilesystemArn) {
            this.efsFilesystemArn = Input.of(Objects.requireNonNull(efsFilesystemArn));
            return this;
        }

        public Builder subdirectory(@Nullable Input<String> subdirectory) {
            this.subdirectory = subdirectory;
            return this;
        }

        public Builder subdirectory(@Nullable String subdirectory) {
            this.subdirectory = Input.ofNullable(subdirectory);
            return this;
        }

        public Builder tags(@Nullable Input<List<LocationEFSTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<LocationEFSTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public LocationEFSArgs build() {
            return new LocationEFSArgs(ec2Config, efsFilesystemArn, subdirectory, tags);
        }
    }
}
