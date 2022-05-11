// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.datalabeling_v1beta1.inputs.GetAnnotationSpecSetArgs;
import com.pulumi.googlenative.datalabeling_v1beta1.inputs.GetDatasetArgs;
import com.pulumi.googlenative.datalabeling_v1beta1.inputs.GetEvaluationJobArgs;
import com.pulumi.googlenative.datalabeling_v1beta1.inputs.GetFeedbackMessageArgs;
import com.pulumi.googlenative.datalabeling_v1beta1.inputs.GetInstructionArgs;
import com.pulumi.googlenative.datalabeling_v1beta1.outputs.GetAnnotationSpecSetResult;
import com.pulumi.googlenative.datalabeling_v1beta1.outputs.GetDatasetResult;
import com.pulumi.googlenative.datalabeling_v1beta1.outputs.GetEvaluationJobResult;
import com.pulumi.googlenative.datalabeling_v1beta1.outputs.GetFeedbackMessageResult;
import com.pulumi.googlenative.datalabeling_v1beta1.outputs.GetInstructionResult;
import java.util.concurrent.CompletableFuture;

public final class Datalabeling_v1beta1Functions {
    /**
     * Gets an annotation spec set by resource name.
     * 
     */
    public static CompletableFuture<GetAnnotationSpecSetResult> getAnnotationSpecSet(GetAnnotationSpecSetArgs args) {
        return getAnnotationSpecSet(args, InvokeOptions.Empty);
    }
    /**
     * Gets an annotation spec set by resource name.
     * 
     */
    public static CompletableFuture<GetAnnotationSpecSetResult> getAnnotationSpecSet(GetAnnotationSpecSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datalabeling/v1beta1:getAnnotationSpecSet", TypeShape.of(GetAnnotationSpecSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets dataset by resource name.
     * 
     */
    public static CompletableFuture<GetDatasetResult> getDataset(GetDatasetArgs args) {
        return getDataset(args, InvokeOptions.Empty);
    }
    /**
     * Gets dataset by resource name.
     * 
     */
    public static CompletableFuture<GetDatasetResult> getDataset(GetDatasetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datalabeling/v1beta1:getDataset", TypeShape.of(GetDatasetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets an evaluation job by resource name.
     * 
     */
    public static CompletableFuture<GetEvaluationJobResult> getEvaluationJob(GetEvaluationJobArgs args) {
        return getEvaluationJob(args, InvokeOptions.Empty);
    }
    /**
     * Gets an evaluation job by resource name.
     * 
     */
    public static CompletableFuture<GetEvaluationJobResult> getEvaluationJob(GetEvaluationJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datalabeling/v1beta1:getEvaluationJob", TypeShape.of(GetEvaluationJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get a FeedbackMessage object.
     * 
     */
    public static CompletableFuture<GetFeedbackMessageResult> getFeedbackMessage(GetFeedbackMessageArgs args) {
        return getFeedbackMessage(args, InvokeOptions.Empty);
    }
    /**
     * Get a FeedbackMessage object.
     * 
     */
    public static CompletableFuture<GetFeedbackMessageResult> getFeedbackMessage(GetFeedbackMessageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datalabeling/v1beta1:getFeedbackMessage", TypeShape.of(GetFeedbackMessageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets an instruction by resource name.
     * 
     */
    public static CompletableFuture<GetInstructionResult> getInstruction(GetInstructionArgs args) {
        return getInstruction(args, InvokeOptions.Empty);
    }
    /**
     * Gets an instruction by resource name.
     * 
     */
    public static CompletableFuture<GetInstructionResult> getInstruction(GetInstructionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datalabeling/v1beta1:getInstruction", TypeShape.of(GetInstructionResult.class), args, Utilities.withVersion(options));
    }
}
