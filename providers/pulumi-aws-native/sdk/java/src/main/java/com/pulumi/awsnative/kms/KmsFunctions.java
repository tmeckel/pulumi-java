// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kms;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.kms.inputs.GetAliasArgs;
import com.pulumi.awsnative.kms.inputs.GetKeyArgs;
import com.pulumi.awsnative.kms.inputs.GetReplicaKeyArgs;
import com.pulumi.awsnative.kms.outputs.GetAliasResult;
import com.pulumi.awsnative.kms.outputs.GetKeyResult;
import com.pulumi.awsnative.kms.outputs.GetReplicaKeyResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class KmsFunctions {
    /**
     * The AWS::KMS::Alias resource specifies a display name for a customer master key (CMK) in AWS Key Management Service (AWS KMS). You can use an alias to identify a CMK in cryptographic operations.
     * 
     */
    public static CompletableFuture<GetAliasResult> getAlias(GetAliasArgs args) {
        return getAlias(args, InvokeOptions.Empty);
    }
    /**
     * The AWS::KMS::Alias resource specifies a display name for a customer master key (CMK) in AWS Key Management Service (AWS KMS). You can use an alias to identify a CMK in cryptographic operations.
     * 
     */
    public static CompletableFuture<GetAliasResult> getAlias(GetAliasArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:kms:getAlias", TypeShape.of(GetAliasResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::KMS::Key resource specifies an AWS KMS key in AWS Key Management Service (AWS KMS). Authorized users can use the AWS KMS key to encrypt and decrypt small amounts of data (up to 4096 bytes), but they are more commonly used to generate data keys. You can also use AWS KMS keys to encrypt data stored in AWS services that are integrated with AWS KMS or within their applications.
     * 
     */
    public static CompletableFuture<GetKeyResult> getKey(GetKeyArgs args) {
        return getKey(args, InvokeOptions.Empty);
    }
    /**
     * The AWS::KMS::Key resource specifies an AWS KMS key in AWS Key Management Service (AWS KMS). Authorized users can use the AWS KMS key to encrypt and decrypt small amounts of data (up to 4096 bytes), but they are more commonly used to generate data keys. You can also use AWS KMS keys to encrypt data stored in AWS services that are integrated with AWS KMS or within their applications.
     * 
     */
    public static CompletableFuture<GetKeyResult> getKey(GetKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:kms:getKey", TypeShape.of(GetKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The AWS::KMS::ReplicaKey resource specifies a multi-region replica AWS KMS key in AWS Key Management Service (AWS KMS).
     * 
     */
    public static CompletableFuture<GetReplicaKeyResult> getReplicaKey(GetReplicaKeyArgs args) {
        return getReplicaKey(args, InvokeOptions.Empty);
    }
    /**
     * The AWS::KMS::ReplicaKey resource specifies a multi-region replica AWS KMS key in AWS Key Management Service (AWS KMS).
     * 
     */
    public static CompletableFuture<GetReplicaKeyResult> getReplicaKey(GetReplicaKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:kms:getReplicaKey", TypeShape.of(GetReplicaKeyResult.class), args, Utilities.withVersion(options));
    }
}
