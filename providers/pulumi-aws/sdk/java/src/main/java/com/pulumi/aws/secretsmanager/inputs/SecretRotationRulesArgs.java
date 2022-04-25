// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class SecretRotationRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretRotationRulesArgs Empty = new SecretRotationRulesArgs();

    /**
     * Specifies the number of days between automatic scheduled rotations of the secret.
     * 
     */
    @Import(name="automaticallyAfterDays", required=true)
    private Output<Integer> automaticallyAfterDays;

    /**
     * @return Specifies the number of days between automatic scheduled rotations of the secret.
     * 
     */
    public Output<Integer> automaticallyAfterDays() {
        return this.automaticallyAfterDays;
    }

    private SecretRotationRulesArgs() {}

    private SecretRotationRulesArgs(SecretRotationRulesArgs $) {
        this.automaticallyAfterDays = $.automaticallyAfterDays;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretRotationRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretRotationRulesArgs $;

        public Builder() {
            $ = new SecretRotationRulesArgs();
        }

        public Builder(SecretRotationRulesArgs defaults) {
            $ = new SecretRotationRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automaticallyAfterDays Specifies the number of days between automatic scheduled rotations of the secret.
         * 
         * @return builder
         * 
         */
        public Builder automaticallyAfterDays(Output<Integer> automaticallyAfterDays) {
            $.automaticallyAfterDays = automaticallyAfterDays;
            return this;
        }

        /**
         * @param automaticallyAfterDays Specifies the number of days between automatic scheduled rotations of the secret.
         * 
         * @return builder
         * 
         */
        public Builder automaticallyAfterDays(Integer automaticallyAfterDays) {
            return automaticallyAfterDays(Output.of(automaticallyAfterDays));
        }

        public SecretRotationRulesArgs build() {
            $.automaticallyAfterDays = Objects.requireNonNull($.automaticallyAfterDays, "expected parameter 'automaticallyAfterDays' to be non-null");
            return $;
        }
    }

}
