// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.SourceControlArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:automation:SourceControl")
public class SourceControl extends io.pulumi.resources.CustomResource {
    @OutputExport(name="autoSync", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoSync;

    public Output</* @Nullable */ Boolean> getAutoSync() {
        return this.autoSync;
    }
    @OutputExport(name="branch", type=String.class, parameters={})
    private Output</* @Nullable */ String> branch;

    public Output</* @Nullable */ String> getBranch() {
        return this.branch;
    }
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> creationTime;

    public Output</* @Nullable */ String> getCreationTime() {
        return this.creationTime;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="folderPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> folderPath;

    public Output</* @Nullable */ String> getFolderPath() {
        return this.folderPath;
    }
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedTime;

    public Output</* @Nullable */ String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="publishRunbook", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publishRunbook;

    public Output</* @Nullable */ Boolean> getPublishRunbook() {
        return this.publishRunbook;
    }
    @OutputExport(name="repoUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> repoUrl;

    public Output</* @Nullable */ String> getRepoUrl() {
        return this.repoUrl;
    }
    @OutputExport(name="sourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceType;

    public Output</* @Nullable */ String> getSourceType() {
        return this.sourceType;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public SourceControl(String name, SourceControlArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:SourceControl", name, args == null ? SourceControlArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SourceControl(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automation:SourceControl", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:automation/v20170515preview:SourceControl").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20190601:SourceControl").build()),
                Input.of(Alias.builder().setType("azure-native:automation/v20200113preview:SourceControl").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SourceControl get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SourceControl(name, id, options);
    }
}
