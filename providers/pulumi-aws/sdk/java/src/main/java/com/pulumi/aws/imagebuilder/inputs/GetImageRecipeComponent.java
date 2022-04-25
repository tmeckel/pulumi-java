// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetImageRecipeComponent extends com.pulumi.resources.InvokeArgs {

    public static final GetImageRecipeComponent Empty = new GetImageRecipeComponent();

    /**
     * Amazon Resource Name (ARN) of the Image Builder Component.
     * 
     */
    @Import(name="componentArn", required=true)
    private String componentArn;

    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Component.
     * 
     */
    public String componentArn() {
        return this.componentArn;
    }

    private GetImageRecipeComponent() {}

    private GetImageRecipeComponent(GetImageRecipeComponent $) {
        this.componentArn = $.componentArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageRecipeComponent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageRecipeComponent $;

        public Builder() {
            $ = new GetImageRecipeComponent();
        }

        public Builder(GetImageRecipeComponent defaults) {
            $ = new GetImageRecipeComponent(Objects.requireNonNull(defaults));
        }

        /**
         * @param componentArn Amazon Resource Name (ARN) of the Image Builder Component.
         * 
         * @return builder
         * 
         */
        public Builder componentArn(String componentArn) {
            $.componentArn = componentArn;
            return this;
        }

        public GetImageRecipeComponent build() {
            $.componentArn = Objects.requireNonNull($.componentArn, "expected parameter 'componentArn' to be non-null");
            return $;
        }
    }

}
