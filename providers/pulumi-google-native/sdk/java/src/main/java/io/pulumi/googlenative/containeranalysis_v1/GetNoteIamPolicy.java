// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.containeranalysis_v1.inputs.GetNoteIamPolicyArgs;
import io.pulumi.googlenative.containeranalysis_v1.outputs.GetNoteIamPolicyResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNoteIamPolicy {
/**
 * Gets the access control policy for a note or an occurrence resource. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if the resource is a note or occurrence, respectively. The resource takes the format `projects/[PROJECT_ID]/notes/[NOTE_ID]` for notes and `projects/[PROJECT_ID]/occurrences/[OCCURRENCE_ID]` for occurrences.
 * 
 */
    public static CompletableFuture<GetNoteIamPolicyResult> invokeAsync(GetNoteIamPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:containeranalysis/v1:getNoteIamPolicy", TypeShape.of(GetNoteIamPolicyResult.class), args == null ? GetNoteIamPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
