// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseArgs Empty = new GetDatabaseArgs();

    /**
     * The name to use for your new Lightsail database resource.
     * 
     */
    @Import(name="relationalDatabaseName", required=true)
    private String relationalDatabaseName;

    /**
     * @return The name to use for your new Lightsail database resource.
     * 
     */
    public String relationalDatabaseName() {
        return this.relationalDatabaseName;
    }

    private GetDatabaseArgs() {}

    private GetDatabaseArgs(GetDatabaseArgs $) {
        this.relationalDatabaseName = $.relationalDatabaseName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseArgs $;

        public Builder() {
            $ = new GetDatabaseArgs();
        }

        public Builder(GetDatabaseArgs defaults) {
            $ = new GetDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param relationalDatabaseName The name to use for your new Lightsail database resource.
         * 
         * @return builder
         * 
         */
        public Builder relationalDatabaseName(String relationalDatabaseName) {
            $.relationalDatabaseName = relationalDatabaseName;
            return this;
        }

        public GetDatabaseArgs build() {
            $.relationalDatabaseName = Objects.requireNonNull($.relationalDatabaseName, "expected parameter 'relationalDatabaseName' to be non-null");
            return $;
        }
    }

}
