// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.ActivityCustomEntityQueryArgs;
import io.pulumi.azurenative.securityinsights.outputs.ActivityEntityQueriesPropertiesResponseQueryDefinitions;
import io.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:securityinsights:ActivityCustomEntityQuery")
public class ActivityCustomEntityQuery extends io.pulumi.resources.CustomResource {
    @OutputExport(name="content", type=String.class, parameters={})
    private Output</* @Nullable */ String> content;

    public Output</* @Nullable */ String> getContent() {
        return this.content;
    }
    @OutputExport(name="createdTimeUtc", type=String.class, parameters={})
    private Output<String> createdTimeUtc;

    public Output<String> getCreatedTimeUtc() {
        return this.createdTimeUtc;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    @OutputExport(name="entitiesFilter", type=Map.class, parameters={String.class, List.class})
    private Output</* @Nullable */ Map<String,List<String>>> entitiesFilter;

    public Output</* @Nullable */ Map<String,List<String>>> getEntitiesFilter() {
        return this.entitiesFilter;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="inputEntityType", type=String.class, parameters={})
    private Output</* @Nullable */ String> inputEntityType;

    public Output</* @Nullable */ String> getInputEntityType() {
        return this.inputEntityType;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="lastModifiedTimeUtc", type=String.class, parameters={})
    private Output<String> lastModifiedTimeUtc;

    public Output<String> getLastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="queryDefinitions", type=ActivityEntityQueriesPropertiesResponseQueryDefinitions.class, parameters={})
    private Output</* @Nullable */ ActivityEntityQueriesPropertiesResponseQueryDefinitions> queryDefinitions;

    public Output</* @Nullable */ ActivityEntityQueriesPropertiesResponseQueryDefinitions> getQueryDefinitions() {
        return this.queryDefinitions;
    }
    @OutputExport(name="requiredInputFieldsSets", type=List.class, parameters={List.class})
    private Output</* @Nullable */ List<List<String>>> requiredInputFieldsSets;

    public Output</* @Nullable */ List<List<String>>> getRequiredInputFieldsSets() {
        return this.requiredInputFieldsSets;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="templateName", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateName;

    public Output</* @Nullable */ String> getTemplateName() {
        return this.templateName;
    }
    @OutputExport(name="title", type=String.class, parameters={})
    private Output</* @Nullable */ String> title;

    public Output</* @Nullable */ String> getTitle() {
        return this.title;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ActivityCustomEntityQuery(String name, ActivityCustomEntityQueryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:ActivityCustomEntityQuery", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ActivityCustomEntityQuery(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:securityinsights:ActivityCustomEntityQuery", name, null, makeResourceOptions(options, id));
    }

    private static ActivityCustomEntityQueryArgs makeArgs(ActivityCustomEntityQueryArgs args) {
        var builder = args == null ? ActivityCustomEntityQueryArgs.builder() : ActivityCustomEntityQueryArgs.builder(args);
        return builder
            .setKind("Activity")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210301preview:ActivityCustomEntityQuery").build()),
                Input.of(Alias.builder().setType("azure-native:securityinsights/v20210901preview:ActivityCustomEntityQuery").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ActivityCustomEntityQuery get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ActivityCustomEntityQuery(name, id, options);
    }
}
