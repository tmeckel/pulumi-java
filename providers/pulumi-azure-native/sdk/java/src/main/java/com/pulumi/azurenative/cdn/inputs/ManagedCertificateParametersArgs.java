// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Managed Certificate used for https
 * 
 */
public final class ManagedCertificateParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedCertificateParametersArgs Empty = new ManagedCertificateParametersArgs();

    /**
     * The type of the Secret to create.
     * Expected value is &#39;ManagedCertificate&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the Secret to create.
     * Expected value is &#39;ManagedCertificate&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ManagedCertificateParametersArgs() {}

    private ManagedCertificateParametersArgs(ManagedCertificateParametersArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedCertificateParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedCertificateParametersArgs $;

        public Builder() {
            $ = new ManagedCertificateParametersArgs();
        }

        public Builder(ManagedCertificateParametersArgs defaults) {
            $ = new ManagedCertificateParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of the Secret to create.
         * Expected value is &#39;ManagedCertificate&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the Secret to create.
         * Expected value is &#39;ManagedCertificate&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ManagedCertificateParametersArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
