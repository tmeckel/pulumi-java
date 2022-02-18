// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaseml_v1beta2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.firebaseml_v1beta2.ModelArgs;
import io.pulumi.googlenative.firebaseml_v1beta2.outputs.ModelStateResponse;
import io.pulumi.googlenative.firebaseml_v1beta2.outputs.OperationResponse;
import io.pulumi.googlenative.firebaseml_v1beta2.outputs.TfLiteModelResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a model in Firebase ML. The longrunning operation will eventually return a Model
 * 
 */
@ResourceType(type="google-native:firebaseml/v1beta2:Model")
public class Model extends io.pulumi.resources.CustomResource {
    /**
     * Lists operation ids associated with this model whose status is NOT done.
     * 
     */
    @OutputExport(name="activeOperations", type=List.class, parameters={OperationResponse.class})
    private Output<List<OperationResponse>> activeOperations;

    /**
     * @return Lists operation ids associated with this model whose status is NOT done.
     * 
     */
    public Output<List<OperationResponse>> getActiveOperations() {
        return this.activeOperations;
    }
    /**
     * Timestamp when this model was created in Firebase ML.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Timestamp when this model was created in Firebase ML.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * The name of the model to create. The name can be up to 32 characters long and can consist only of ASCII Latin letters A-Z and a-z, underscores(_) and ASCII digits 0-9. It must start with a letter.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The name of the model to create. The name can be up to 32 characters long and can consist only of ASCII Latin letters A-Z and a-z, underscores(_) and ASCII digits 0-9. It must start with a letter.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * See RFC7232 https://tools.ietf.org/html/rfc7232#section-2.3
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return See RFC7232 https://tools.ietf.org/html/rfc7232#section-2.3
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The model_hash will change if a new file is available for download.
     * 
     */
    @OutputExport(name="modelHash", type=String.class, parameters={})
    private Output<String> modelHash;

    /**
     * @return The model_hash will change if a new file is available for download.
     * 
     */
    public Output<String> getModelHash() {
        return this.modelHash;
    }
    /**
     * The resource name of the Model. Model names have the form `projects/{project_id}/models/{model_id}` The name is ignored when creating a model.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the Model. Model names have the form `projects/{project_id}/models/{model_id}` The name is ignored when creating a model.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * State common to all model types. Includes publishing and validation information.
     * 
     */
    @OutputExport(name="state", type=ModelStateResponse.class, parameters={})
    private Output<ModelStateResponse> state;

    /**
     * @return State common to all model types. Includes publishing and validation information.
     * 
     */
    public Output<ModelStateResponse> getState() {
        return this.state;
    }
    /**
     * User defined tags which can be used to group/filter models during listing
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={String.class})
    private Output<List<String>> tags;

    /**
     * @return User defined tags which can be used to group/filter models during listing
     * 
     */
    public Output<List<String>> getTags() {
        return this.tags;
    }
    /**
     * A TFLite Model
     * 
     */
    @OutputExport(name="tfliteModel", type=TfLiteModelResponse.class, parameters={})
    private Output<TfLiteModelResponse> tfliteModel;

    /**
     * @return A TFLite Model
     * 
     */
    public Output<TfLiteModelResponse> getTfliteModel() {
        return this.tfliteModel;
    }
    /**
     * Timestamp when this model was updated in Firebase ML.
     * 
     */
    @OutputExport(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Timestamp when this model was updated in Firebase ML.
     * 
     */
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Model(String name, ModelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebaseml/v1beta2:Model", name, args == null ? ModelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Model(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firebaseml/v1beta2:Model", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Model get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Model(name, id, options);
    }
}
