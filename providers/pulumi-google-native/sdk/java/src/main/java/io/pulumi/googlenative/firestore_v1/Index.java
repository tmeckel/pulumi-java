// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firestore_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.firestore_v1.IndexArgs;
import io.pulumi.googlenative.firestore_v1.outputs.GoogleFirestoreAdminV1IndexFieldResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a composite index. This returns a google.longrunning.Operation which may be used to track the status of the creation. The metadata for the operation will be the type IndexOperationMetadata.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:firestore/v1:Index")
public class Index extends io.pulumi.resources.CustomResource {
    /**
     * The fields supported by this index. For composite indexes, this is always 2 or more fields. The last field entry is always for the field path `__name__`. If, on creation, `__name__` was not specified as the last field, it will be added automatically with the same direction as that of the last field defined. If the final field in a composite index is not directional, the `__name__` will be ordered ASCENDING (unless explicitly specified). For single field indexes, this will always be exactly one entry with a field path equal to the field path of the associated field.
     * 
     */
    @OutputExport(name="fields", type=List.class, parameters={GoogleFirestoreAdminV1IndexFieldResponse.class})
    private Output<List<GoogleFirestoreAdminV1IndexFieldResponse>> fields;

    /**
     * @return The fields supported by this index. For composite indexes, this is always 2 or more fields. The last field entry is always for the field path `__name__`. If, on creation, `__name__` was not specified as the last field, it will be added automatically with the same direction as that of the last field defined. If the final field in a composite index is not directional, the `__name__` will be ordered ASCENDING (unless explicitly specified). For single field indexes, this will always be exactly one entry with a field path equal to the field path of the associated field.
     * 
     */
    public Output<List<GoogleFirestoreAdminV1IndexFieldResponse>> getFields() {
        return this.fields;
    }
    /**
     * A server defined name for this index. The form of this name for composite indexes will be: `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{composite_index_id}` For single field indexes, this field will be empty.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A server defined name for this index. The form of this name for composite indexes will be: `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{composite_index_id}` For single field indexes, this field will be empty.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Indexes with a collection query scope specified allow queries against a collection that is the child of a specific document, specified at query time, and that has the same collection id. Indexes with a collection group query scope specified allow queries against all collections descended from a specific document, specified at query time, and that have the same collection id as this index.
     * 
     */
    @OutputExport(name="queryScope", type=String.class, parameters={})
    private Output<String> queryScope;

    /**
     * @return Indexes with a collection query scope specified allow queries against a collection that is the child of a specific document, specified at query time, and that has the same collection id. Indexes with a collection group query scope specified allow queries against all collections descended from a specific document, specified at query time, and that have the same collection id as this index.
     * 
     */
    public Output<String> getQueryScope() {
        return this.queryScope;
    }
    /**
     * The serving state of the index.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The serving state of the index.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Index(String name, IndexArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firestore/v1:Index", name, args == null ? IndexArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Index(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:firestore/v1:Index", name, null, makeResourceOptions(options, id));
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
    public static Index get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Index(name, id, options);
    }
}
