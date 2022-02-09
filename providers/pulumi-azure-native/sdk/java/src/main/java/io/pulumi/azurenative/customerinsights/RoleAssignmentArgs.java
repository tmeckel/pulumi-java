// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.customerinsights.enums.RoleTypes;
import io.pulumi.azurenative.customerinsights.inputs.AssignmentPrincipalArgs;
import io.pulumi.azurenative.customerinsights.inputs.ResourceSetDescriptionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoleAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoleAssignmentArgs Empty = new RoleAssignmentArgs();

    @InputImport(name="assignmentName")
    private final @Nullable Input<String> assignmentName;

    public Input<String> getAssignmentName() {
        return this.assignmentName == null ? Input.empty() : this.assignmentName;
    }

    @InputImport(name="conflationPolicies")
    private final @Nullable Input<ResourceSetDescriptionArgs> conflationPolicies;

    public Input<ResourceSetDescriptionArgs> getConflationPolicies() {
        return this.conflationPolicies == null ? Input.empty() : this.conflationPolicies;
    }

    @InputImport(name="connectors")
    private final @Nullable Input<ResourceSetDescriptionArgs> connectors;

    public Input<ResourceSetDescriptionArgs> getConnectors() {
        return this.connectors == null ? Input.empty() : this.connectors;
    }

    @InputImport(name="description")
    private final @Nullable Input<Map<String,String>> description;

    public Input<Map<String,String>> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<Map<String,String>> displayName;

    public Input<Map<String,String>> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="hubName", required=true)
    private final Input<String> hubName;

    public Input<String> getHubName() {
        return this.hubName;
    }

    @InputImport(name="interactions")
    private final @Nullable Input<ResourceSetDescriptionArgs> interactions;

    public Input<ResourceSetDescriptionArgs> getInteractions() {
        return this.interactions == null ? Input.empty() : this.interactions;
    }

    @InputImport(name="kpis")
    private final @Nullable Input<ResourceSetDescriptionArgs> kpis;

    public Input<ResourceSetDescriptionArgs> getKpis() {
        return this.kpis == null ? Input.empty() : this.kpis;
    }

    @InputImport(name="links")
    private final @Nullable Input<ResourceSetDescriptionArgs> links;

    public Input<ResourceSetDescriptionArgs> getLinks() {
        return this.links == null ? Input.empty() : this.links;
    }

    @InputImport(name="principals", required=true)
    private final Input<List<AssignmentPrincipalArgs>> principals;

    public Input<List<AssignmentPrincipalArgs>> getPrincipals() {
        return this.principals;
    }

    @InputImport(name="profiles")
    private final @Nullable Input<ResourceSetDescriptionArgs> profiles;

    public Input<ResourceSetDescriptionArgs> getProfiles() {
        return this.profiles == null ? Input.empty() : this.profiles;
    }

    @InputImport(name="relationshipLinks")
    private final @Nullable Input<ResourceSetDescriptionArgs> relationshipLinks;

    public Input<ResourceSetDescriptionArgs> getRelationshipLinks() {
        return this.relationshipLinks == null ? Input.empty() : this.relationshipLinks;
    }

    @InputImport(name="relationships")
    private final @Nullable Input<ResourceSetDescriptionArgs> relationships;

    public Input<ResourceSetDescriptionArgs> getRelationships() {
        return this.relationships == null ? Input.empty() : this.relationships;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="role", required=true)
    private final Input<RoleTypes> role;

    public Input<RoleTypes> getRole() {
        return this.role;
    }

    @InputImport(name="roleAssignments")
    private final @Nullable Input<ResourceSetDescriptionArgs> roleAssignments;

    public Input<ResourceSetDescriptionArgs> getRoleAssignments() {
        return this.roleAssignments == null ? Input.empty() : this.roleAssignments;
    }

    @InputImport(name="sasPolicies")
    private final @Nullable Input<ResourceSetDescriptionArgs> sasPolicies;

    public Input<ResourceSetDescriptionArgs> getSasPolicies() {
        return this.sasPolicies == null ? Input.empty() : this.sasPolicies;
    }

    @InputImport(name="segments")
    private final @Nullable Input<ResourceSetDescriptionArgs> segments;

    public Input<ResourceSetDescriptionArgs> getSegments() {
        return this.segments == null ? Input.empty() : this.segments;
    }

    @InputImport(name="views")
    private final @Nullable Input<ResourceSetDescriptionArgs> views;

    public Input<ResourceSetDescriptionArgs> getViews() {
        return this.views == null ? Input.empty() : this.views;
    }

    @InputImport(name="widgetTypes")
    private final @Nullable Input<ResourceSetDescriptionArgs> widgetTypes;

    public Input<ResourceSetDescriptionArgs> getWidgetTypes() {
        return this.widgetTypes == null ? Input.empty() : this.widgetTypes;
    }

    public RoleAssignmentArgs(
        @Nullable Input<String> assignmentName,
        @Nullable Input<ResourceSetDescriptionArgs> conflationPolicies,
        @Nullable Input<ResourceSetDescriptionArgs> connectors,
        @Nullable Input<Map<String,String>> description,
        @Nullable Input<Map<String,String>> displayName,
        Input<String> hubName,
        @Nullable Input<ResourceSetDescriptionArgs> interactions,
        @Nullable Input<ResourceSetDescriptionArgs> kpis,
        @Nullable Input<ResourceSetDescriptionArgs> links,
        Input<List<AssignmentPrincipalArgs>> principals,
        @Nullable Input<ResourceSetDescriptionArgs> profiles,
        @Nullable Input<ResourceSetDescriptionArgs> relationshipLinks,
        @Nullable Input<ResourceSetDescriptionArgs> relationships,
        Input<String> resourceGroupName,
        Input<RoleTypes> role,
        @Nullable Input<ResourceSetDescriptionArgs> roleAssignments,
        @Nullable Input<ResourceSetDescriptionArgs> sasPolicies,
        @Nullable Input<ResourceSetDescriptionArgs> segments,
        @Nullable Input<ResourceSetDescriptionArgs> views,
        @Nullable Input<ResourceSetDescriptionArgs> widgetTypes) {
        this.assignmentName = assignmentName;
        this.conflationPolicies = conflationPolicies;
        this.connectors = connectors;
        this.description = description;
        this.displayName = displayName;
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.interactions = interactions;
        this.kpis = kpis;
        this.links = links;
        this.principals = Objects.requireNonNull(principals, "expected parameter 'principals' to be non-null");
        this.profiles = profiles;
        this.relationshipLinks = relationshipLinks;
        this.relationships = relationships;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.roleAssignments = roleAssignments;
        this.sasPolicies = sasPolicies;
        this.segments = segments;
        this.views = views;
        this.widgetTypes = widgetTypes;
    }

    private RoleAssignmentArgs() {
        this.assignmentName = Input.empty();
        this.conflationPolicies = Input.empty();
        this.connectors = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.hubName = Input.empty();
        this.interactions = Input.empty();
        this.kpis = Input.empty();
        this.links = Input.empty();
        this.principals = Input.empty();
        this.profiles = Input.empty();
        this.relationshipLinks = Input.empty();
        this.relationships = Input.empty();
        this.resourceGroupName = Input.empty();
        this.role = Input.empty();
        this.roleAssignments = Input.empty();
        this.sasPolicies = Input.empty();
        this.segments = Input.empty();
        this.views = Input.empty();
        this.widgetTypes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> assignmentName;
        private @Nullable Input<ResourceSetDescriptionArgs> conflationPolicies;
        private @Nullable Input<ResourceSetDescriptionArgs> connectors;
        private @Nullable Input<Map<String,String>> description;
        private @Nullable Input<Map<String,String>> displayName;
        private Input<String> hubName;
        private @Nullable Input<ResourceSetDescriptionArgs> interactions;
        private @Nullable Input<ResourceSetDescriptionArgs> kpis;
        private @Nullable Input<ResourceSetDescriptionArgs> links;
        private Input<List<AssignmentPrincipalArgs>> principals;
        private @Nullable Input<ResourceSetDescriptionArgs> profiles;
        private @Nullable Input<ResourceSetDescriptionArgs> relationshipLinks;
        private @Nullable Input<ResourceSetDescriptionArgs> relationships;
        private Input<String> resourceGroupName;
        private Input<RoleTypes> role;
        private @Nullable Input<ResourceSetDescriptionArgs> roleAssignments;
        private @Nullable Input<ResourceSetDescriptionArgs> sasPolicies;
        private @Nullable Input<ResourceSetDescriptionArgs> segments;
        private @Nullable Input<ResourceSetDescriptionArgs> views;
        private @Nullable Input<ResourceSetDescriptionArgs> widgetTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignmentName = defaults.assignmentName;
    	      this.conflationPolicies = defaults.conflationPolicies;
    	      this.connectors = defaults.connectors;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.hubName = defaults.hubName;
    	      this.interactions = defaults.interactions;
    	      this.kpis = defaults.kpis;
    	      this.links = defaults.links;
    	      this.principals = defaults.principals;
    	      this.profiles = defaults.profiles;
    	      this.relationshipLinks = defaults.relationshipLinks;
    	      this.relationships = defaults.relationships;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.role = defaults.role;
    	      this.roleAssignments = defaults.roleAssignments;
    	      this.sasPolicies = defaults.sasPolicies;
    	      this.segments = defaults.segments;
    	      this.views = defaults.views;
    	      this.widgetTypes = defaults.widgetTypes;
        }

        public Builder setAssignmentName(@Nullable Input<String> assignmentName) {
            this.assignmentName = assignmentName;
            return this;
        }

        public Builder setAssignmentName(@Nullable String assignmentName) {
            this.assignmentName = Input.ofNullable(assignmentName);
            return this;
        }

        public Builder setConflationPolicies(@Nullable Input<ResourceSetDescriptionArgs> conflationPolicies) {
            this.conflationPolicies = conflationPolicies;
            return this;
        }

        public Builder setConflationPolicies(@Nullable ResourceSetDescriptionArgs conflationPolicies) {
            this.conflationPolicies = Input.ofNullable(conflationPolicies);
            return this;
        }

        public Builder setConnectors(@Nullable Input<ResourceSetDescriptionArgs> connectors) {
            this.connectors = connectors;
            return this;
        }

        public Builder setConnectors(@Nullable ResourceSetDescriptionArgs connectors) {
            this.connectors = Input.ofNullable(connectors);
            return this;
        }

        public Builder setDescription(@Nullable Input<Map<String,String>> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable Map<String,String> description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<Map<String,String>> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable Map<String,String> displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setHubName(Input<String> hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }

        public Builder setHubName(String hubName) {
            this.hubName = Input.of(Objects.requireNonNull(hubName));
            return this;
        }

        public Builder setInteractions(@Nullable Input<ResourceSetDescriptionArgs> interactions) {
            this.interactions = interactions;
            return this;
        }

        public Builder setInteractions(@Nullable ResourceSetDescriptionArgs interactions) {
            this.interactions = Input.ofNullable(interactions);
            return this;
        }

        public Builder setKpis(@Nullable Input<ResourceSetDescriptionArgs> kpis) {
            this.kpis = kpis;
            return this;
        }

        public Builder setKpis(@Nullable ResourceSetDescriptionArgs kpis) {
            this.kpis = Input.ofNullable(kpis);
            return this;
        }

        public Builder setLinks(@Nullable Input<ResourceSetDescriptionArgs> links) {
            this.links = links;
            return this;
        }

        public Builder setLinks(@Nullable ResourceSetDescriptionArgs links) {
            this.links = Input.ofNullable(links);
            return this;
        }

        public Builder setPrincipals(Input<List<AssignmentPrincipalArgs>> principals) {
            this.principals = Objects.requireNonNull(principals);
            return this;
        }

        public Builder setPrincipals(List<AssignmentPrincipalArgs> principals) {
            this.principals = Input.of(Objects.requireNonNull(principals));
            return this;
        }

        public Builder setProfiles(@Nullable Input<ResourceSetDescriptionArgs> profiles) {
            this.profiles = profiles;
            return this;
        }

        public Builder setProfiles(@Nullable ResourceSetDescriptionArgs profiles) {
            this.profiles = Input.ofNullable(profiles);
            return this;
        }

        public Builder setRelationshipLinks(@Nullable Input<ResourceSetDescriptionArgs> relationshipLinks) {
            this.relationshipLinks = relationshipLinks;
            return this;
        }

        public Builder setRelationshipLinks(@Nullable ResourceSetDescriptionArgs relationshipLinks) {
            this.relationshipLinks = Input.ofNullable(relationshipLinks);
            return this;
        }

        public Builder setRelationships(@Nullable Input<ResourceSetDescriptionArgs> relationships) {
            this.relationships = relationships;
            return this;
        }

        public Builder setRelationships(@Nullable ResourceSetDescriptionArgs relationships) {
            this.relationships = Input.ofNullable(relationships);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRole(Input<RoleTypes> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(RoleTypes role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public Builder setRoleAssignments(@Nullable Input<ResourceSetDescriptionArgs> roleAssignments) {
            this.roleAssignments = roleAssignments;
            return this;
        }

        public Builder setRoleAssignments(@Nullable ResourceSetDescriptionArgs roleAssignments) {
            this.roleAssignments = Input.ofNullable(roleAssignments);
            return this;
        }

        public Builder setSasPolicies(@Nullable Input<ResourceSetDescriptionArgs> sasPolicies) {
            this.sasPolicies = sasPolicies;
            return this;
        }

        public Builder setSasPolicies(@Nullable ResourceSetDescriptionArgs sasPolicies) {
            this.sasPolicies = Input.ofNullable(sasPolicies);
            return this;
        }

        public Builder setSegments(@Nullable Input<ResourceSetDescriptionArgs> segments) {
            this.segments = segments;
            return this;
        }

        public Builder setSegments(@Nullable ResourceSetDescriptionArgs segments) {
            this.segments = Input.ofNullable(segments);
            return this;
        }

        public Builder setViews(@Nullable Input<ResourceSetDescriptionArgs> views) {
            this.views = views;
            return this;
        }

        public Builder setViews(@Nullable ResourceSetDescriptionArgs views) {
            this.views = Input.ofNullable(views);
            return this;
        }

        public Builder setWidgetTypes(@Nullable Input<ResourceSetDescriptionArgs> widgetTypes) {
            this.widgetTypes = widgetTypes;
            return this;
        }

        public Builder setWidgetTypes(@Nullable ResourceSetDescriptionArgs widgetTypes) {
            this.widgetTypes = Input.ofNullable(widgetTypes);
            return this;
        }

        public RoleAssignmentArgs build() {
            return new RoleAssignmentArgs(assignmentName, conflationPolicies, connectors, description, displayName, hubName, interactions, kpis, links, principals, profiles, relationshipLinks, relationships, resourceGroupName, role, roleAssignments, sasPolicies, segments, views, widgetTypes);
        }
    }
}
