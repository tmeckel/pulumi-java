// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.datasync.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLocationFSxWindowsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLocationFSxWindowsArgs Empty = new GetLocationFSxWindowsArgs();

    /**
     * The Amazon Resource Name (ARN) of the Amazon FSx for Windows file system location that is created.
     * 
     */
    @Import(name="locationArn", required=true)
    private String locationArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon FSx for Windows file system location that is created.
     * 
     */
    public String locationArn() {
        return this.locationArn;
    }

    private GetLocationFSxWindowsArgs() {}

    private GetLocationFSxWindowsArgs(GetLocationFSxWindowsArgs $) {
        this.locationArn = $.locationArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocationFSxWindowsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocationFSxWindowsArgs $;

        public Builder() {
            $ = new GetLocationFSxWindowsArgs();
        }

        public Builder(GetLocationFSxWindowsArgs defaults) {
            $ = new GetLocationFSxWindowsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param locationArn The Amazon Resource Name (ARN) of the Amazon FSx for Windows file system location that is created.
         * 
         * @return builder
         * 
         */
        public Builder locationArn(String locationArn) {
            $.locationArn = locationArn;
            return this;
        }

        public GetLocationFSxWindowsArgs build() {
            $.locationArn = Objects.requireNonNull($.locationArn, "expected parameter 'locationArn' to be non-null");
            return $;
        }
    }

}
