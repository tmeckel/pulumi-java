// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1.inputs.LocationArgs;
import java.util.List;
import java.util.Objects;


/**
 * Details on how a particular software package was installed on a system.
 * 
 */
public final class PackageOccurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PackageOccurrenceArgs Empty = new PackageOccurrenceArgs();

    /**
     * All of the places within the filesystem versions of this package have been found.
     * 
     */
    @Import(name="location", required=true)
    private Output<List<LocationArgs>> location;

    /**
     * @return All of the places within the filesystem versions of this package have been found.
     * 
     */
    public Output<List<LocationArgs>> location() {
        return this.location;
    }

    private PackageOccurrenceArgs() {}

    private PackageOccurrenceArgs(PackageOccurrenceArgs $) {
        this.location = $.location;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PackageOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PackageOccurrenceArgs $;

        public Builder() {
            $ = new PackageOccurrenceArgs();
        }

        public Builder(PackageOccurrenceArgs defaults) {
            $ = new PackageOccurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location All of the places within the filesystem versions of this package have been found.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<List<LocationArgs>> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location All of the places within the filesystem versions of this package have been found.
         * 
         * @return builder
         * 
         */
        public Builder location(List<LocationArgs> location) {
            return location(Output.of(location));
        }

        /**
         * @param location All of the places within the filesystem versions of this package have been found.
         * 
         * @return builder
         * 
         */
        public Builder location(LocationArgs... location) {
            return location(List.of(location));
        }

        public PackageOccurrenceArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
