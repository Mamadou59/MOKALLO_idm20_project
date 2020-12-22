/**
 */
package idm.simpleusd.mm.usd.provider;

import idm.simpleusd.mm.usd.BlockQuote;
import idm.simpleusd.mm.usd.UsdFactory;
import idm.simpleusd.mm.usd.UsdPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link idm.simpleusd.mm.usd.BlockQuote} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockQuoteItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockQuoteItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UsdPackage.Literals.BLOCK_QUOTE__CONTENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns BlockQuote.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BlockQuote"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BlockQuote_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BlockQuote.class)) {
		case UsdPackage.BLOCK_QUOTE__CONTENTS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(UsdPackage.Literals.BLOCK_QUOTE__CONTENTS,
				UsdFactory.eINSTANCE.createParagraph()));

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.BLOCK_QUOTE__CONTENTS, UsdFactory.eINSTANCE.createTitle()));

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.BLOCK_QUOTE__CONTENTS, UsdFactory.eINSTANCE.createLink()));

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.BLOCK_QUOTE__CONTENTS, UsdFactory.eINSTANCE.createImage()));

		newChildDescriptors.add(createChildParameter(UsdPackage.Literals.BLOCK_QUOTE__CONTENTS,
				UsdFactory.eINSTANCE.createStrongEmphasis()));

		newChildDescriptors.add(createChildParameter(UsdPackage.Literals.BLOCK_QUOTE__CONTENTS,
				UsdFactory.eINSTANCE.createItalicEmphasis()));

		newChildDescriptors.add(createChildParameter(UsdPackage.Literals.BLOCK_QUOTE__CONTENTS,
				UsdFactory.eINSTANCE.createOrderedList()));

		newChildDescriptors.add(createChildParameter(UsdPackage.Literals.BLOCK_QUOTE__CONTENTS,
				UsdFactory.eINSTANCE.createUnorderedList()));

		newChildDescriptors.add(createChildParameter(UsdPackage.Literals.BLOCK_QUOTE__CONTENTS,
				UsdFactory.eINSTANCE.createBlockQuote()));

		newChildDescriptors.add(createChildParameter(UsdPackage.Literals.BLOCK_QUOTE__CONTENTS,
				UsdFactory.eINSTANCE.createCodeBlock()));

		newChildDescriptors.add(createChildParameter(UsdPackage.Literals.BLOCK_QUOTE__CONTENTS,
				UsdFactory.eINSTANCE.createHorizontalLine()));

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.BLOCK_QUOTE__CONTENTS, UsdFactory.eINSTANCE.createTable()));

		newChildDescriptors.add(createChildParameter(UsdPackage.Literals.BLOCK_QUOTE__CONTENTS,
				UsdFactory.eINSTANCE.createTableCell()));

		newChildDescriptors.add(
				createChildParameter(UsdPackage.Literals.BLOCK_QUOTE__CONTENTS, UsdFactory.eINSTANCE.createButton()));

		newChildDescriptors.add(createChildParameter(UsdPackage.Literals.BLOCK_QUOTE__CONTENTS,
				UsdFactory.eINSTANCE.createNavigation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UsdEditPlugin.INSTANCE;
	}

}
