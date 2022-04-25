// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lambda.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCodeSigningConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCodeSigningConfigArgs Empty = new GetCodeSigningConfigArgs();

    /**
     * A unique Arn for CodeSigningConfig resource
     * 
     */
    @Import(name="codeSigningConfigArn", required=true)
    private String codeSigningConfigArn;

    /**
     * @return A unique Arn for CodeSigningConfig resource
     * 
     */
    public String codeSigningConfigArn() {
        return this.codeSigningConfigArn;
    }

    private GetCodeSigningConfigArgs() {}

    private GetCodeSigningConfigArgs(GetCodeSigningConfigArgs $) {
        this.codeSigningConfigArn = $.codeSigningConfigArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCodeSigningConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCodeSigningConfigArgs $;

        public Builder() {
            $ = new GetCodeSigningConfigArgs();
        }

        public Builder(GetCodeSigningConfigArgs defaults) {
            $ = new GetCodeSigningConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param codeSigningConfigArn A unique Arn for CodeSigningConfig resource
         * 
         * @return builder
         * 
         */
        public Builder codeSigningConfigArn(String codeSigningConfigArn) {
            $.codeSigningConfigArn = codeSigningConfigArn;
            return this;
        }

        public GetCodeSigningConfigArgs build() {
            $.codeSigningConfigArn = Objects.requireNonNull($.codeSigningConfigArn, "expected parameter 'codeSigningConfigArn' to be non-null");
            return $;
        }
    }

}
