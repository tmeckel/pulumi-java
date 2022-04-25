// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoveryreadiness.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResourceSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceSetArgs Empty = new GetResourceSetArgs();

    /**
     * The name of the resource set to create.
     * 
     */
    @Import(name="resourceSetName", required=true)
    private String resourceSetName;

    /**
     * @return The name of the resource set to create.
     * 
     */
    public String resourceSetName() {
        return this.resourceSetName;
    }

    private GetResourceSetArgs() {}

    private GetResourceSetArgs(GetResourceSetArgs $) {
        this.resourceSetName = $.resourceSetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceSetArgs $;

        public Builder() {
            $ = new GetResourceSetArgs();
        }

        public Builder(GetResourceSetArgs defaults) {
            $ = new GetResourceSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceSetName The name of the resource set to create.
         * 
         * @return builder
         * 
         */
        public Builder resourceSetName(String resourceSetName) {
            $.resourceSetName = resourceSetName;
            return this;
        }

        public GetResourceSetArgs build() {
            $.resourceSetName = Objects.requireNonNull($.resourceSetName, "expected parameter 'resourceSetName' to be non-null");
            return $;
        }
    }

}
