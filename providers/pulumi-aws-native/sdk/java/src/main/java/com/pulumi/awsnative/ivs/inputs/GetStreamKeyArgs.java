// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ivs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStreamKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStreamKeyArgs Empty = new GetStreamKeyArgs();

    /**
     * Stream Key ARN is automatically generated on creation and assigned as the unique identifier.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return Stream Key ARN is automatically generated on creation and assigned as the unique identifier.
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetStreamKeyArgs() {}

    private GetStreamKeyArgs(GetStreamKeyArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStreamKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStreamKeyArgs $;

        public Builder() {
            $ = new GetStreamKeyArgs();
        }

        public Builder(GetStreamKeyArgs defaults) {
            $ = new GetStreamKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Stream Key ARN is automatically generated on creation and assigned as the unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetStreamKeyArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
