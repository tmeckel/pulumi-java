// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AliasArgs extends com.pulumi.resources.ResourceArgs {

    public static final AliasArgs Empty = new AliasArgs();

    /**
     * Specifies the alias name. This value must begin with alias/ followed by a name, such as alias/ExampleAlias. The alias name cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.
     * 
     */
    @Import(name="aliasName")
    private @Nullable Output<String> aliasName;

    /**
     * @return Specifies the alias name. This value must begin with alias/ followed by a name, such as alias/ExampleAlias. The alias name cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.
     * 
     */
    public Optional<Output<String>> aliasName() {
        return Optional.ofNullable(this.aliasName);
    }

    /**
     * Identifies the CMK to which the alias refers. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. You cannot specify another alias. For help finding the key ID and ARN, see Finding the Key ID and ARN in the AWS Key Management Service Developer Guide.
     * 
     */
    @Import(name="targetKeyId", required=true)
    private Output<String> targetKeyId;

    /**
     * @return Identifies the CMK to which the alias refers. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. You cannot specify another alias. For help finding the key ID and ARN, see Finding the Key ID and ARN in the AWS Key Management Service Developer Guide.
     * 
     */
    public Output<String> targetKeyId() {
        return this.targetKeyId;
    }

    private AliasArgs() {}

    private AliasArgs(AliasArgs $) {
        this.aliasName = $.aliasName;
        this.targetKeyId = $.targetKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AliasArgs $;

        public Builder() {
            $ = new AliasArgs();
        }

        public Builder(AliasArgs defaults) {
            $ = new AliasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aliasName Specifies the alias name. This value must begin with alias/ followed by a name, such as alias/ExampleAlias. The alias name cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.
         * 
         * @return builder
         * 
         */
        public Builder aliasName(@Nullable Output<String> aliasName) {
            $.aliasName = aliasName;
            return this;
        }

        /**
         * @param aliasName Specifies the alias name. This value must begin with alias/ followed by a name, such as alias/ExampleAlias. The alias name cannot begin with alias/aws/. The alias/aws/ prefix is reserved for AWS managed CMKs.
         * 
         * @return builder
         * 
         */
        public Builder aliasName(String aliasName) {
            return aliasName(Output.of(aliasName));
        }

        /**
         * @param targetKeyId Identifies the CMK to which the alias refers. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. You cannot specify another alias. For help finding the key ID and ARN, see Finding the Key ID and ARN in the AWS Key Management Service Developer Guide.
         * 
         * @return builder
         * 
         */
        public Builder targetKeyId(Output<String> targetKeyId) {
            $.targetKeyId = targetKeyId;
            return this;
        }

        /**
         * @param targetKeyId Identifies the CMK to which the alias refers. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. You cannot specify another alias. For help finding the key ID and ARN, see Finding the Key ID and ARN in the AWS Key Management Service Developer Guide.
         * 
         * @return builder
         * 
         */
        public Builder targetKeyId(String targetKeyId) {
            return targetKeyId(Output.of(targetKeyId));
        }

        public AliasArgs build() {
            $.targetKeyId = Objects.requireNonNull($.targetKeyId, "expected parameter 'targetKeyId' to be non-null");
            return $;
        }
    }

}
